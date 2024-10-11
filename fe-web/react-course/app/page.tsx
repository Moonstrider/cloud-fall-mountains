import Card from "@/app/components/Card";

export default function Home() {
  const cardList = ["aa", "b", "c"];
  console.log(cardList)
  return (
      <div className="">
        <h1>My Cards</h1>
        {
          cardList.map(
              (card, index) => (
                  <Card key={index} title={card}/>
              )
          )
        }
      </div>
  );
}
