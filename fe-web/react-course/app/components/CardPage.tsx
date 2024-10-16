'use client';

import {useCard} from "@/app/CardContext";
import SingleCard from "@/app/components/SingleCard";
import AddCard from "@/app/components/AddCard";

export default function CardPage() {

  const {cardList} = useCard();

  return (
      <div>
        <AddCard/>
        {
          cardList.map(
              (card, index) => (
                  <SingleCard
                      key={index}
                      card={card}
                  />
              )
          )
        }
      </div>
  )


}