'use client';

import { BarChart, Bar, XAxis, YAxis, Tooltip, CartesianGrid, ResponsiveContainer } from 'recharts';

type Props = {
  yes: number;
  no: number;
};

export default function VoteBarChart({ yes, no }: Props) {
  const data = [
    { name: 'YES', votes: yes },
    { name: 'NO', votes: no },
  ];

  return (
      <div className="w-full h-64">
        <ResponsiveContainer width="100%" height="100%">
          <BarChart data={data}>
            <CartesianGrid strokeDasharray="3 3" />
            <XAxis dataKey="name" />
            <YAxis allowDecimals={false} />
            <Tooltip />
            <Bar dataKey="votes" fill="#8884d8" />
          </BarChart>
        </ResponsiveContainer>
      </div>
  );
}
