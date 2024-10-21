'use client';

import {useCard} from "@/app/CardContext";

interface ModalProps {
  id: string;
  closeModal: () => void;
}

export default function Modal(
    {id, closeModal}: ModalProps
) {

  const {deleteCard} = useCard();

  return (
      <div className="modal">
        <p>Are you sure?</p>
        <button className='btn btn--alt' onClick={closeModal}>Cancel</button>
        <button className='btn' onClick={() => deleteCard(id, closeModal)}>Confirm</button>
      </div>
  );

  /**
   * onClick={() => deleteCard(id)
   * This code is using an arrow function to delay the execution
   * of the deleteCard(id) function until the button is clicked.
   * The onClick handler expects a function reference,
   * not the result of a function call.
   * In this case, the arrow function () => deleteCard(id)
   * creates a new function that will only call deleteCard(id)
   * when the button is actually clicked.
   * This ensures that deleteCard(id) is not
   * executed immediately when the component renders.
   */
}