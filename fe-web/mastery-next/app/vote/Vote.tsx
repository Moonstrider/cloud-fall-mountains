'use client';

import {useEffect, useState} from 'react';
import VoteBarChart from "@/app/vote/VoteBarChart";

export default function Vote() {
  const [question, setQuestion] = useState('');
  const [yesCount, setYesCount] = useState(0);
  const [noCount, setNoCount] = useState(0);
  const [hasVoted, setHasVoted] = useState(false);

  useEffect(() => {
    fetch('/api/questions/1')
    .then(res => res.json())
    .then(data => {
      setQuestion(data.question);
      setYesCount(data.yes);
      setNoCount(data.no);
    });
  }, []);

  const handleVote = async (vote: 'YES' | 'NO') => {
    if (hasVoted) return;

    const res = await fetch('/api/questions/1', {
      method: 'POST',
      headers: {'Content-Type': 'application/json'},
      body: JSON.stringify({vote}),
    });

    const data = await res.json();
    setYesCount(data.yes);
    setNoCount(data.no);
    setHasVoted(true);
  };

  return (
      <div className="p-4 max-w-xl mx-auto">
        <h1 className="text-2xl font-bold mb-4">{question}</h1>
        <div className="flex space-x-4 mb-4">
          <button onClick={() => handleVote('YES')}
                  className="px-4 py-2 bg-green-500 text-white rounded">
            YES
          </button>
          <button onClick={() => handleVote('NO')}
                  className="px-4 py-2 bg-red-500 text-white rounded">
            NO
          </button>
        </div>
        {hasVoted && (
              <VoteBarChart yes={yesCount} no={noCount}/>
        )}
      </div>
  );
}
