import CardPage from "@/app/components/CardPage";
import {CardProvider, useCard} from "@/app/CardContext";

export default function EnglishCardPage() {
  const {englishCards} = useCard();
  return (
      <div>
        <CardProvider>
          <CardPage languageCards={englishCards}/>
        </CardProvider>
      </div>
  )
}