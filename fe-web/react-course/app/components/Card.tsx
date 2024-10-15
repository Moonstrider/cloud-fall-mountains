'use client';

import {useState} from "react";
import Backdrop from "@/app/components/Backdrop";
import Modal from "@/app/components/Modal";

interface CardProps {
  title: string;
  deleteMyself: (deleteCard: string) => void;
}

export default function Card({title, deleteMyself}: CardProps) {

  const [showModel, setShowModel] = useState(false);

  function deleteHandler() {
    setShowModel(true);
  }

  function saveHandler() {
  }

  function handleEdit(e) {
    console.log("robert:"+e.target.innerText);
  }

  function closeModal() {
    setShowModel(false);
  }

  return (
      <div className="card">
        <h2 className="bigger" contentEditable="true"
            onSubmit={(e) => handleEdit(e)}>{title}</h2>
        <div className="btn-arr">
          <div className="actions">
            <button className="btn" onClick={saveHandler}>
              Save
            </button>
          </div>
          <div className="actions">
            {/*如果在deleteHandler()加了括号那js加载到这行代码就会执行这个方法*/}
            {/*我们是希望在点delete按钮的时候才执行这个方法，所以不能加括号*/}
            {/*<button className="btn" onClick={deleteHandler()}>*/}
            <button className="btn" onClick={deleteHandler}>
              Delete
            </button>
          </div>
        </div>
        {showModel && <Modal title={title} deleteCard={deleteMyself} myOnCancel={closeModal}/>}
        {showModel && <Backdrop myOnCancel={closeModal}/>}
      </div>
  );
}
