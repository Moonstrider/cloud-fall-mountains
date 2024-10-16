'use client';

import React, {useState} from "react";
import Backdrop from "@/app/components/Backdrop";
import Modal from "@/app/components/Modal";
import {Card} from "@/app/components/Types";
import OperationBtn from "@/app/components/OperationBtn";

interface CardProps {
  card: Card;
  cardList: Card[];
  setCardList: React.Dispatch<React.SetStateAction<Card[]>>
  deleteMyself: (deleteCard: string) => void;
}

export default function SingleCard(
    {card, cardList, setCardList, deleteMyself}: CardProps) {

  const [showModel, setShowModel] = useState<boolean>(false);
  const [editTitle, setEditTitle] = useState<string>(card.title);
  const [showButton, setShowButton] = useState(false);
  // 当鼠标移入时显示按钮
  const handleMouseEnter = () => {
    setShowButton(true);
  };
  // 当鼠标移出时隐藏按钮
  const handleMouseLeave = () => {
    setShowButton(false);
  };

  function saveHandler(e: React.FormEvent, id: number) {
    e.preventDefault();
    // cardContent.title = editTitle;

    console.log("cardList----" + JSON.stringify(cardList));
    setCardList(cardList.map((card: Card) => (
        card.id === id ? {...card, title: editTitle} : card
    )));

    console.log("cardList1234" + JSON.stringify(cardList));
  }

  function editHandler(e) {
    setEditTitle(e.target.value)
  }

  function deleteHandler() {
    setShowModel(true);
  }

  function closeModal() {
    setShowModel(false);
  }

  return (
      <div className="single-card"
           onMouseEnter={handleMouseEnter}
           onMouseLeave={handleMouseLeave}
      >
        <form>
          <input
              className="input__box"
              type="text"
              value={editTitle}
              onChange={(e) => editHandler(e)}
          />
        </form>

        {/*{showButton && (*/}
            <OperationBtn card={card} deleteHandler={deleteHandler} saveHandler={saveHandler}/>
        {/*)}*/}

        {showModel &&
            <Modal title={card.title} deleteCard={deleteMyself} myOnCancel={closeModal}/>}
        {showModel &&
            <Backdrop myOnCancel={closeModal}/>}


      </div>
  );
}
