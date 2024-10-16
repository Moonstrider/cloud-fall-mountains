'use client';

import {CardProvider} from "@/app/CardContext";
import CardPage from "@/app/components/CardPage";

export default function Home() {
  return (
      <div
          className="flex items-center justify-center"
      >
        <CardProvider>
          <CardPage/>
        </CardProvider>
      </div>
  );
}
