import Link from "next/link";
import ProductCardPage from "@/app/components/ProductCard";

export default function Home() {
  return (
      <main>
        <h1>main</h1>
        <Link href="/users">Users</Link>
        <ProductCardPage/>
      </main>
  )
}
