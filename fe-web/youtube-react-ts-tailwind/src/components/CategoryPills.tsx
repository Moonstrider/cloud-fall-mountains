import {Button} from "./Button.tsx";
import {ChevronLeft} from "lucide-react";

type CategoryPillProps = {
    categories: string[],
    selectedCategory: string,
    onSelect: (category: string) => void
}

export function CategoryPills({categories, selectedCategory, onSelect}: CategoryPillProps) {
    return (
        <div className="overflow-x-hidden relative">
            <div className="flex whitespace-nowrap gap-3
            transition-transform w-[max-content]">
                {
                    categories.map((category, index) => (
                        <Button key={index}
                                onClick={() => onSelect(category)}
                                variant={selectedCategory === category ? "dark" : "default"}
                                className="py-1 px-3 rounded-lg whitespace-nowrap">
                            {category}
                        </Button>
                    ))
                }
            </div>
            <div>
                <Button variant="ghost" size="icon" className="
                h-full aspect-square w-auto p-1.5">
                    <ChevronLeft/>
                </Button>
            </div>
        </div>
    )
}