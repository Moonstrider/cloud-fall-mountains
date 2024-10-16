'use client';

import {createContext, ReactNode, useContext, useEffect, useState} from "react";
import {EnglishCard, NewEnglishCard} from "@/app/components/Types";

type CardProviderProps = {
  children: ReactNode
}

type CardContext = {
  fetchCard: () => void
  updateCard: (updatedCard: EnglishCard) => void
  addCard: (card: EnglishCard) => Promise<void>
  deleteCard: (id: string, closeModal) => Promise<void>
  cardList: EnglishCard[]
}

const CardContext = createContext({} as CardContext)

export function useCard() {
  return useContext(CardContext)
}

export function CardProvider({children}: CardProviderProps) {

  const [cardList, setCardList] = useState<EnglishCard[]>([])

  const jsonServerUrl = 'http://localhost:4001'
  const path = '/englishCard'
  // const { path } = useLocation()
  const url = jsonServerUrl + path;

  useEffect(() => {
    fetchCard();
  })

  const fetchCard = async () => {
    const resFromJsonServer = await fetch(url);
    const cards = await resFromJsonServer.json();
    // setCardList(cards.reverse());
    setCardList(cards);
  }


  const addCard = async (card: NewEnglishCard) => {
    // const addCardToJsonServer = async (card: NewEnglishCard) => {
    // const res =
    await fetch(url, {
      method: "POST",
      headers: {
        "Content-type": "application/json",
      },
      body: JSON.stringify(card),
    })
    .then((response) => response.json())
    .then((newCard) => {
      setCardList([newCard, ...cardList]);
    })
    // return await res.json();
    // };

    // const newCard = await addCardToJsonServer(card);
    // console.log("cardList:"+JSON.stringify(cardList))
    // console.log("newCard:"+JSON.stringify(newCard))
    // very tricky order
    // setCardList([newCard, ...cardList]);
  }

  const deleteCard = async (id: string, closeModal) => {
    await fetch(`${url}/${id}`, {
      method: "DELETE",
    })
    .then((response) => response.json())
    .then((deletedCard) => {
      /*
      the array filter function will return
      a new array which contains elements that matches the condition
      */
      setCardList(cardList.filter((card) => card.id !== deletedCard.id));
    });
    closeModal();
  }

  const updateCard = async (updatedCard: EnglishCard) => {
    fetch(`${url}/${updatedCard.id}`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({en: updatedCard.en}), // Only updating the 'title' field
    })
    .then((response) => response.json())
    .then((updatedCard) => {
      // Update the local state to reflect the changes
      setCardList(
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
            fetchCard: fetchCard,
            updateCard: updateCard,
            addCard: addCard,
            deleteCard: deleteCard,
            cardList: cardList,
          }}
      >
        {children}
      </CardContext.Provider>
  )
}