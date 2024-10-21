import CardPage from "@/app/components/CardPage";
import {CardProvider} from "@/app/CardContext";

export default function EnglishCardPage() {
  return (
      <div>
        <CardProvider>
          <CardPage/>
        </CardProvider>
      </div>
  )
}