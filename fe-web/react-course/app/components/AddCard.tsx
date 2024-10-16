import React, {useState} from 'react'
import {useCard} from "@/app/CardContext";

export default function AddCard() {

  const {addCard} = useCard();
  const [en, setEn] = useState('')

  const submitAdd = (e) => {
    e.preventDefault()
    const id = Math.floor(100000 + Math.random() * 900000).toString()
    addCard({id: id, en: en, cn: '', example: ''})
    setEn('')
  }

  return (
      <div>
        <div className='add__title'>
          <input type='text' placeholder='title' value={en}
                 onChange={(e) => setEn(e.target.value)}/>
        </div>
        <button className="add__button" onClick={(e)=>submitAdd(e)}>
          Add
        </button>
      </div>
  )
}