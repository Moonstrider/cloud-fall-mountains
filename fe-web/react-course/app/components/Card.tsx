interface CardProps {
  title: string;
}

export default function Card({title}: CardProps) {
  return (
      <div className="card">
        <h2>{title}</h2>
        <div className="actions">
          <button className="btn">
            Delete
          </button>
        </div>
      </div>
  );
}
