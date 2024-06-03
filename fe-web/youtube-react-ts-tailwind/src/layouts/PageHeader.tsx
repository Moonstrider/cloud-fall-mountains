import logo from '../assets/react.svg'
import {ArrowLeft, Bell, Menu, Mic, Search, Upload, User} from "lucide-react";
import {Button} from "../components/Button.tsx";
import {useState} from "react";
import {useSidebarContext} from "../contexts/SidebarContext.tsx";

export function PageHeader() {

    const [showFullWidthSearch, setShowFullWidthSearch] = useState(false)

    return (
        <div className="flex gap-10 lg:gap-20 justify-between pt-2 mb-6 mx-4">
            <PageHeaderFirstSection hidden={showFullWidthSearch}/>
            <form className={`gap-4 flex-grow justify-center ${showFullWidthSearch ? "flex" : "hidden md:flex"}`}>
                {showFullWidthSearch &&
                    (<Button type="button" size="icon" variant="ghost" className="flex-shrink-0"
                             onClick={() => setShowFullWidthSearch(false)}>
                        <ArrowLeft/>
                    </Button>)
                }
                <div className="flex flex-grow max-w-[600px]">
                    <input type="search"
                           placeholder="Search"
                           className="rounded-l-full border border-secondary-border shadow-inner
                        shadow-secondary py-1 px-4 text-lg w-full focus:border-blue-500 outline-none"
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
                        onClick={() => setShowFullWidthSearch(true)}>
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

type PageHeaderFirstSectionProps = {
    hidden?: boolean
}

export function PageHeaderFirstSection({hidden = false}: PageHeaderFirstSectionProps) {

    const {toggle} = useSidebarContext()

    return (
        <div className={`gap-4 items-center flex-shrink-0 ${hidden ? "hidden" : "flex"}`}>
            <Button onClick={toggle} variant="ghost" size="icon">
                <Menu/>
            </Button>
            <a href="/">
                <img src={logo} alt="Logo" className="h-1"/>
            </a>
        </div>
    )
}