'use client';

import {createContext, ReactNode, useContext, useEffect, useState} from "react";
import {LanguageCard} from "@/app/components/Types";

type CardProviderProps = {
  children: ReactNode
}

type CardContext = {
  englishCards: LanguageCard[]
  germanCards: LanguageCard[]
  fetchCard: () => Promise<void>
  addCard: (path: string, card: LanguageCard) => Promise<void>
  updateCard: (updatedCard: LanguageCard) => Promise<void>
  deleteCard: (id: string) => Promise<void>
}

const CardContext = createContext({} as CardContext)

export function useCard() {
  return useContext(CardContext)
}

export function CardProvider({children}: CardProviderProps) {

  const [englishCards, setEnglishCards] = useState<LanguageCard[]>([])
  const [germanCards, setGermanCards] = useState<LanguageCard[]>([])

  const jsonServerUrl = 'http://localhost:4001'
  const germanEndpoint = '/germanCard'
  const englishEndpoint = '/englishCard'
  // const { path } = useLocation()
  const enUrl = jsonServerUrl + englishEndpoint;
  const deUrl = jsonServerUrl + germanEndpoint;

  useEffect(() => {
    fetchCard();
  }, [])

  const fetchCard = async () => {
    const enResFromJsonServer = await fetch(enUrl);
    const enCards = await enResFromJsonServer.json();
    setEnglishCards(enCards.reverse());

    const deResFromJsonServer = await fetch(deUrl);
    const deCards = await deResFromJsonServer.json();
    setGermanCards(deCards.reverse())
  }


  const addCard = async (path: string, card: LanguageCard) => {
    let url;
    if (path === "englishCard") {
      url = enUrl;
    } else if (path === "germanCard") {
      url = deUrl
    } else {
      throw Error("wrong path 1")
    }

    await fetch(url, {
      method: "POST",
      headers: {
        "Content-type": "application/json",
      },
      body: JSON.stringify(card),
    })
    .then((response) => response.json())
    .then((newCard) => {
      // very tricky order
      if (path === "englishCard") {
        setEnglishCards([newCard, ...englishCards]);
      } else if (path === "germanCard") {
        setGermanCards([newCard, ...germanCards]);
      } else {
        throw Error("wrong path 2")
      }
    })
  }

  const deleteCard = async (id: string) => {
    await fetch(`${enUrl}/${id}`, {
      method: "DELETE",
    })
    /*
    the array filter function will return
    a new array which contains elements that matches the condition
    */
    setEnglishCards(englishCards.filter((card) => card.id !== id));
  }

  const updateCard = async (updatedCard: LanguageCard) => {
    fetch(`${enUrl}/${updatedCard.id}`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({en: updatedCard.en}), // Only updating the 'title' field
    })
    .then((response) => response.json())
    .then((updatedCard) => {
      // Update the local state to reflect the changes
      setEnglishCards(
          (cardList) =>
              cardList.map((card) =>
                  card.id === updatedCard.id ? {...card, en: updatedCard.en} : card
              )
      )
    })
  }

  return (
      <CardContext.Provider
          value={{
            englishCards: englishCards,
            germanCards: germanCards,
            fetchCard: fetchCard,
            addCard: addCard,
            updateCard: updateCard,
            deleteCard: deleteCard,
          }}
      >
        {children}
      </CardContext.Provider>
  )
}