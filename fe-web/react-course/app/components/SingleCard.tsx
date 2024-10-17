'use client';

import React, {useState} from "react";
import Backdrop from "@/app/components/modal/Backdrop";
import Modal from "@/app/components/modal/Modal";
import {EnglishCard} from "@/app/components/Types";
import OperationBtn from "@/app/components/OperationBtn";
import {useCard} from "@/app/CardContext";

interface CardProps {
  card: EnglishCard;
}

export default function SingleCard({card}: CardProps) {

  const {updateCard} = useCard();
  const [showModel, setShowModel] = useState<boolean>(false);
  const [currentEn, setCurrentEn] = useState<string>(card.en);
  const [showButton, setShowButton] = useState(false);

  // 当鼠标移入时显示按钮
  const handleMouseEnter = () => {
    setShowButton(true);
  };
  // 当鼠标移出时隐藏按钮
  const handleMouseLeave = () => {
    setShowButton(false);
  };

  function editHandler(e) {
    setCurrentEn(e.target.value)
  }

  // update the current card and the card in the cardList
  // current card is always updated when the input value changes
  // so in this function, we need to update the card in the cardList
  // update card in json server first then use the response to update the card in the cardList
  function saveHandler(e: React.FormEvent) {
    e.preventDefault();
    card.en = currentEn;
    updateCard(card);
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
              value={currentEn}
              onChange={(e) => editHandler(e)}
          />
        </form>

        {showButton && (
            <OperationBtn card={card} saveHandler={saveHandler}
                          closeModal={closeModal}/>
        )}

        {showModel &&
            <Modal id={card.id} closeModal={closeModal}/>}
        {showModel &&
            <Backdrop closeModal={closeModal}/>}

      </div>
  );
}
