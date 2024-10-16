'use client';

import SingleCard from "@/app/components/SingleCard";
import {useEffect, useState} from "react";
import {Card} from "@/app/components/Types";

export default function Home() {

  const [cardList, setCardList] = useState<Card[]>([]);

  useEffect(() => {
    // fetch card list
    setCardList([
      {id: 1, title: '111'},
      {id: 2, title: '222'},
      {id: 3, title: '333'}
    ]);
  }, [])

  function printCardList() {
    console.log("cardList:" + JSON.stringify(cardList))
  }

  function deleteCard(deleteCard: string) {
    console.log('delete card:', deleteCard);
    const remains = cardList.filter((card) => card !== deleteCard);
    console.log("remains" + remains)
    setCardList(remains);
  }

  return (
      <div className="">
        <h1>My Cards</h1>
        {
          cardList.map(
              (card, index) => (
                  <SingleCard
                      key={index}
                      card={card}
                      cardList={cardList}
                      setCardList={setCardList}
                      deleteMyself={deleteCard}
                  />
              )
          )
        }
      </div>
  );
}
