import {CardProvider, useCard} from "@/app/CardContext";
import CardPage from "@/app/components/CardPage";

export default function GermanCardPage(){
  const {germanCards} = useCard();
  return (
      <div>
        <CardProvider>
          <CardPage languageCards={germanCards}/>
        </CardProvider>
      </div>
  )
}