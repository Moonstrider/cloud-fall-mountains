import {PageHeader} from "./layouts/PageHeader.tsx";
import {CategoryPills} from "./components/CategoryPills.tsx";
import {categories} from "./data/home.ts";
import {useState} from "react";

export default function App() {

    const [selectedCategory, setSelectedCategory] = useState(categories[0])

    return (
        <div className="max-h-screen flex flex-col">
            <PageHeader/>
            <div className="grid grid-cols-[auto, 1fr] flex-grow-1 overflow-auto">
                {/* the content in this div can scroll independently */}
                <div>Sidebar</div>

                <div className="overflow-x-hidden px-8 pb-4">
                    <div className="sticky top-0 bg-white z-10 pb-4">
                        <CategoryPills
                            categories={categories}
                            selectedCategory={selectedCategory}
                            onSelect={setSelectedCategory}
                        />
                    </div>
                </div>
            </div>
        </div>
    )
}