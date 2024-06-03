import {createContext, ReactNode, useContext, useEffect, useState} from "react";

type SidebarProviderProps = {
    children: ReactNode
}

type SidebarContextType = {
    isLargeOpen: boolean
    isSmallOpen: boolean
    toggle: () => void
    close: () => void
}

const SidebarContext = createContext<SidebarContextType | null>(null)

// eslint-disable-next-line react-refresh/only-export-components
export function useSidebarContext() {
    const value = useContext(SidebarContext)
    if (value == null) throw Error("Cannot use outside SidebarProvider")
    return value;
}

export function SidebarProvider({children}: SidebarProviderProps) {
    const [isLargeOpen, setIsLargeOpen] = useState(true)
    const [isSmallOpen, setIsSmallOpen] = useState(false)

    useEffect(() => {
        const handler = () => {
            if (!isScreenSmall()) {
                setIsSmallOpen(false)
            }
        }

        window.addEventListener("resize", handler)

        return () => {
            window.removeEventListener("resize", handler)
        }
    }, [])

    function isScreenSmall() {
        return window.innerWidth < 1024
    }

    function toggle() {
        if (isScreenSmall()) {
            setIsSmallOpen(prev => !prev)
        } else {
            setIsLargeOpen(prev => !prev)
        }
    }

    function close() {
        if (isScreenSmall()) {
            setIsSmallOpen(false)
        } else {
            setIsLargeOpen(false)
        }
    }

    return (
        <SidebarContext.Provider value={{
            isLargeOpen,
            isSmallOpen,
            toggle,
            close
        }}>
            {children}
        </SidebarContext.Provider>
    )
}