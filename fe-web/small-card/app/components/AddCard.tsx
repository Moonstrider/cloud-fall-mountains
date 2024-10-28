import React, {useRef, useState} from 'react'
import {useCard} from "@/app/CardContext";

export default function AddCard() {

  const {addCard} = useCard();
  const [en, setEn] = useState('')
  const [pronounce, setPronounce] = useState('')
  const [cn, setCn] = useState('')
  const [example, setExample] = useState('')
  const inputRef = useRef<HTMLInputElement | null>(null);

  const submitAdd = (e) => {
    e.preventDefault()
    const id = Math.floor(100000 + Math.random() * 900000).toString()
    addCard({
      id: id,
      en: en,
      pronounce: pronounce,
      cn: cn,
      example: example,
      createTime: new Date().toLocaleString()
    })
    .then(() => {
      setEn('')
      setCn('')
      setPronounce('')
      setExample('')
    });
    inputRef.current?.focus();// Focus the input again
  }

  const handleKeyDown = (event: React.KeyboardEvent<HTMLInputElement>) => {
    if (event.key === 'Enter') {
      console.log('Enter key pressed');
      // Handle form submission or other logic here
      submitAdd(event);
    }
  };

  return (
      <div className='sticky top-0'>
        <div className='add__title grid grid-cols-4 gap-4'>
          <input ref={inputRef} type='text' placeholder='english' value={en}
                 onChange={(e) => setEn(e.target.value)}
                 onKeyDown={handleKeyDown}
          />
          <input type='text' placeholder='cn' value={cn}
                 onChange={(e) => setCn(e.target.value)}
                 onKeyDown={handleKeyDown}
          />
          <input type='text' placeholder='pronounce' value={pronounce}
                 onChange={(e) => setPronounce(e.target.value)}
                 onKeyDown={handleKeyDown}
          />
          <input type='text' placeholder='example' value={example}
                 onChange={(e) => setExample(e.target.value)}
                 onKeyDown={handleKeyDown}
          />
        </div>
        <button className="add__button" onClick={submitAdd}>
          Add
        </button>
      </div>
  )
}