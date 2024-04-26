import {ThemedLayoutV2, ThemedTitleV2} from "@refinedev/antd";
import Header from "./header";

const Layout = ({children}: React.PropsWithChildren) => {
    return (
        <ThemedLayoutV2
            Header={Header}
            Title={(titleProps) => <ThemedTitleV2 {...titleProps} text="Refine"/>}
        >
            {/*This is a special prop that renders the child components of the Layout component*/}
            {children}
        </ThemedLayoutV2>
    )
}

export default Layout
