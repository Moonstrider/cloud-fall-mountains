'use client';

import SingleCard from "@/app/components/SingleCard";
import AddCard from "@/app/components/AddCard";
import {LanguageCard} from "@/app/components/Types";
import {useCard} from "@/app/CardContext";

export default function CardPage(languageCards:LanguageCard[]) {
  const {englishCards} = useCard();
  return (
      <div>
        <AddCard/>
        <div className="h-56 grid grid-cols-5 content-start">
          {
            englishCards.map(
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