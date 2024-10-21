import React, { useState, useEffect } from "react";

interface Card {
  id: string;
  title: string;
  description: string;
}

const UpdateCard: React.FC = () => {
  const [cards, setCards] = useState<Card[]>([]);
  const [editTitle, setEditTitle] = useState<string>("");

  // Fetch initial data from the JSON server
  useEffect(() => {
    fetch("http://localhost:4001/cards")
    .then((response) => response.json())
    .then((data) => setCards(data));
  }, []);

  // Function to update the title of a specific card
  const updateCard = (id: string) => {
    fetch(`http://localhost:4001/cards/${id}`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ title: editTitle }), // Only updating the 'title' field
    })
    .then((response) => response.json())
    .then((updatedCard) => {
      // Update the local state to reflect the changes
      setCards((prevCards) =>
          prevCards.map((card) =>
              card.id === id ? { ...card, title: updatedCard.title } : card
          )
      );
    });
  };

  return (
      <div>
        <h1>Update Card Title</h1>
        {cards.map((card) => (
            <div key={card.id}>
              <h2>{card.title}</h2>
              <p>{card.description}</p>
              <input
                  type="text"
                  value={editTitle}
                  onChange={(e) => setEditTitle(e.target.value)}
                  placeholder="Edit title"
              />
              <button onClick={() => updateCard(card.id)}>Update Title</button>
            </div>
        ))}
      </div>
  );
};

export default UpdateCard;