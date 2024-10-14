'use client';

import Card from "@/app/components/Card";
import {useEffect, useState} from "react";

export default function Home() {

  const [cardList, setCardList] = useState<string[]>([]);

  useEffect(() => {
    // fetch card list
    setCardList(['1', '2', '3', '4', '5'])
  }, [])

  console.log("cardList:" + cardList)

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
                  <Card key={index} title={card} deleteMyself={deleteCard}/>
              )
          )
        }
        {/*<Card title="Card 1"/>*/}
        {/*<Card title="Card 1"/>*/}
        {/*<Card title="Card 1"/>*/}
      </div>
  );
}
