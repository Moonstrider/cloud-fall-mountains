'use client';

import {CardProvider, useCard} from "@/app/CardContext";
import CardPage from "@/app/components/CardPage";

export default function Home() {
  const {englishCards} = useCard();
  return (
      <div>
        <CardProvider>
          <CardPage languageCards={englishCards}/>
        </CardProvider>
      </div>
  );
}
