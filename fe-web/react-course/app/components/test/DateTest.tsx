// 'use client';

export default function DateTest() {

  const now1 = new Date();
  console.log(now1)
  // const now2 = new Date();
  // console.log(now2)

  return (
      <div>
        <div>
          {JSON.stringify(now1)}
        </div>
        <div>
          {new Date().toLocaleString()}
        </div>
      </div>
  )
}