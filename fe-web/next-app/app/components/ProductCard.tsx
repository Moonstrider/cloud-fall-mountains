import AddToCart from "@/app/components/AddToCart";
import styles from "@/app/components/ProductCard.module.css";

export default function ProductCardPage() {
  return (
      // <div className={styles.card}>
      // <div className='p-5 my-5 bg-sky-400 text-white text-xl hover:bg-sky-500'>
      <div>
        <AddToCart/>
      </div>
  )
}