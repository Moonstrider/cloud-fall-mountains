import {EnglishCard} from "@/app/components/Types";
import {useCard} from "@/app/CardContext";

interface OperationBtnProps {
  card: EnglishCard;
  saveHandler: (e: React.MouseEvent<HTMLSpanElement>, id: string) => void;
  closeModal: () => void;
}

export default function OperationBtn(
    {
      card,
      saveHandler,
      closeModal
    }: OperationBtnProps) {

  const {deleteCard} = useCard();

  return (
      <div className="btn-arr">
        <div className="actions">
            <span className="operationBtn" onClick={(e) =>
                saveHandler(e, card.id)}>
              Save
            </span>
        </div>
        <div className="actions">
          {/*如果在deleteHandler()加了括号那js加载到这行代码就会执行这个方法*/}
          {/*我们是希望在点delete按钮的时候才执行这个方法，所以不能加括号*/}
          {/*<button className="btn" onClick={deleteHandler()}>*/}
          <span className="operationBtn" onClick={() => deleteCard(card.id, closeModal)}>
              Delete
            </span>
        </div>
      </div>
  )
}