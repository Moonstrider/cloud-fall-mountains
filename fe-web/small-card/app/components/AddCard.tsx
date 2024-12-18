import React, {useRef, useState} from 'react'
import {useCard} from "@/app/CardContext";
import {usePathname} from "next/navigation";

export default function AddCard() {

  const pathname = usePathname()
  console.log("pathname:"+pathname)
  const {addCard} = useCard();
  const [en, setEn] = useState('')
  const [de, setDe] = useState('')
  const [pronounce, setPronounce] = useState('')
  const [cn, setCn] = useState('')
  const [example, setExample] = useState('')
  const inputRef = useRef<HTMLInputElement | null>(null);

  const submitAdd = (e) => {
    e.preventDefault()
    const id = Math.floor(100000 + Math.random() * 900000).toString()
    addCard("/englishCard",{
      id: id,
      en: en,
      de: de,
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
        <div className='add__title grid grid-cols-5 gap-4'>
          <input ref={inputRef} type='text' placeholder='english' value={en}
                 onChange={(e) => setEn(e.target.value)}
                 onKeyDown={handleKeyDown}
          />
          <input ref={inputRef} type='text' placeholder='deutsch' value={de}
                 onChange={(e) => setDe(e.target.value)}
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