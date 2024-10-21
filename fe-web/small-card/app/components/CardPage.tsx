'use client';

import {useCard} from "@/app/CardContext";
import SingleCard from "@/app/components/SingleCard";
import AddCard from "@/app/components/AddCard";

export default function CardPage() {

  const {cardList} = useCard();

  return (
      <div>
        <AddCard/>
        <div className="h-56 grid grid-cols-5 content-start">
          {
            cardList.map(
                (card) => (
                    <SingleCard
                        key={card.id}
                        card={card}
                    />
                )
            )
          }
        </div>
      </div>
  )


}