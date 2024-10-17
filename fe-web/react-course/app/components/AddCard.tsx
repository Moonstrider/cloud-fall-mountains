import React, {useRef, useState} from 'react'
import {useCard} from "@/app/CardContext";

export default function AddCard() {

  const {addCard} = useCard();
  const [en, setEn] = useState('')
  const inputRef = useRef<HTMLInputElement | null>(null);

  const submitAdd = (e) => {
    e.preventDefault()
    const id = Math.floor(100000 + Math.random() * 900000).toString()
    addCard({id: id, en: en, cn: '', example: ''})
    .then(() => setEn(''));
    inputRef.current?.focus();  // Focus the input again
  }

  return (
      <div>
        <div className='add__title'>
          <input ref={inputRef} type='text' placeholder='title' value={en}
                 onChange={(e) => setEn(e.target.value)}/>
        </div>
        <button className="add__button" onClick={submitAdd}>
          Add
        </button>
      </div>
  )
}