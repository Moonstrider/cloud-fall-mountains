import logo from '../assets/react.svg'
import {Bell, Menu, Mic, Search, Upload, User} from "lucide-react";
import {Button} from "../components/Button.tsx";
import {useState} from "react";

export function PageHeader() {
    const [showFullWidthSearch, setShowFullWidthSearch] = useState(false)
    return (
        <div className="flex gap-10 lg:gap-20 justify-between pt-2 mb-6 mx-4">
            <div className={`gap-4 items-center flex-shrink-0 ${showFullWidthSearch ? "hidden" : "flex"}`}>
                <Button variant="ghost" size="icon">
                    <Menu/>
                </Button>
                <a href="/">
                    <img src={logo} alt="Logo" className="h-1"/>
                </a>
            </div>
            <form className={`md:flex hidden gap-4 flex-grow justify-center ${showFullWidthSearch ? "flex" : "hidden"}`}>
                <div className="flex flex-grow max-w-[600px]">
                    <input type="search"
                           placeholder="Search"
                           className="
                        rounded-l-full
                        border
                        border-secondary-border shadow-inner
                        shadow-secondary py-1 px-4 text-lg w-full
                        focus:border-blue-500 outline-none"
                    />
                    <Button type="button" size="search">
                        <Search/>
                    </Button>
                </div>
                <Button type="button" size="icon" className="flex-shrink-0">
                    <Mic/>
                </Button>
            </form>
            <div className={`flex-shrink-0 md:gap-2 ${showFullWidthSearch ? "hidden" : "flex"}`}>
                <Button size="icon" variant="ghost" className="md:hidden"
                        onClick={() => setShowFullWidthSearch(true)}
                >
                    <Search/>
                </Button>
                <Button size="icon" variant="ghost" className="md:hidden">
                    <Mic/>
                </Button>
                <Button size="icon" variant="ghost">
                    <Upload/>
                </Button>
                <Button size="icon" variant="ghost">
                    <Bell/>
                </Button>
                <Button size="icon" variant="ghost">
                    <User/>
                </Button>
            </div>
        </div>
    )
}