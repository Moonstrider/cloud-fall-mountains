import {PageHeader} from "./layouts/PageHeader.tsx";
import {CategoryPills} from "./components/CategoryPills.tsx";
import {categories, videos} from "./data/home.ts";
import {useState} from "react";
import {VideoGridItem} from "./components/VideoGridItem.tsx";
import {Sidebar} from "./layouts/Sidebar.tsx";

export default function App() {

    const [selectedCategory, setSelectedCategory] = useState(categories[0])

    return (
        <div className="max-h-screen flex flex-col">
            <PageHeader/>
            <div className="grid grid-cols-[auto, 1fr] flex-grow-1 overflow-auto">
                {/*<div className="flex">*/}
                {/* the content in this div can scroll independently */}
                <Sidebar/>

                <div className="overflow-x-hidden px-8 pb-4">
                    {/*search history bar*/}
                    <div className="sticky top-0 bg-white z-10 pb-4">
                        <CategoryPills
                            categories={categories}
                            selectedCategory={selectedCategory}
                            onSelect={setSelectedCategory}
                        />
                    </div>
                    {/*videos*/}
                    <div className="grid gap-4 grid-cols-[repeat(auto-fill,minmax(300px,1fr))]">
                        {videos.map(video => (
                            <VideoGridItem key={video.id} {...video}/>
                        ))}
                    </div>
                </div>
            </div>
        </div>
    )
}