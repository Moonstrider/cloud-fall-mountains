import {Card} from "@/app/components/Types";

interface OperationBtnProps {
  card: Card;
  deleteHandler: (e: React.MouseEvent<HTMLSpanElement>) => void;
  saveHandler: (e: React.MouseEvent<HTMLSpanElement>, id: number) => void;
}
export default function OperationBtn({card, deleteHandler, saveHandler}: OperationBtnProps) {
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
          <span className="operationBtn" onClick={deleteHandler}>
              Delete
            </span>
        </div>
      </div>
  )
}