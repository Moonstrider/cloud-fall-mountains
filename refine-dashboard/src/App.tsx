import {Authenticated, Refine} from "@refinedev/core";
import {DevtoolsProvider} from "@refinedev/devtools";
import {RefineKbar, RefineKbarProvider} from "@refinedev/kbar";

import {useNotificationProvider} from "@refinedev/antd";
import "@refinedev/antd/dist/reset.css";

import {authProvider, dataProvider, liveProvider} from "./providers";
import routerBindings, {
    CatchAllNavigate,
    DocumentTitleHandler,
    UnsavedChangesNotifier,
} from "@refinedev/react-router-v6";
import {App as AntdApp} from "antd";
import {BrowserRouter, Outlet, Route, Routes} from "react-router-dom";
import {ForgotPassword, Home, Login, Register} from "./pages";
import React from "react";
import Layout from "./components/layout";
import {resources} from "@/config/resources";

function App() {
    return (
        <BrowserRouter>
            {/*<GitHubBanner/>*/}
            <RefineKbarProvider>
                <AntdApp>
                    <DevtoolsProvider>
                        <Refine
                            dataProvider={dataProvider}
                            liveProvider={liveProvider}
                            notificationProvider={useNotificationProvider}
                            routerProvider={routerBindings}
                            authProvider={authProvider}
                            resources={resources}
                            options={{
                                syncWithLocation: true,
                                warnWhenUnsavedChanges: true,
                                useNewQueryKeys: true,
                                projectId: "cZ8F46-4bA2sZ-hA0bIi",
                                liveMode: "auto",
                            }}
                        >
                            <Routes>
                                <Route path="/register" element={<Register/>}/>
                                <Route path="/login" element={<Login/>}/>
                                <Route path="/forgot-password" element={<ForgotPassword/>}/>
                                <Route path="/" element={
                                    // <Authenticated
                                    //     key="authenticated-layout"
                                    //     fallback={<CatchAllNavigate to="/"/>}
                                    //     v3LegacyAuthProviderCompatible
                                    // >
                                        <Layout>
                                            {/*this Outlet is a special component that
                                                renders the child route of the current route
                                                in this case the Home page is the child
                                                of the Authenticated route*/}
                                            <Outlet/>
                                        </Layout>
                                    // </Authenticated>
                                }>
                                    <Route index element={<Home/>}/>
                                </Route>
                            </Routes>
                            <RefineKbar/>
                            <UnsavedChangesNotifier/>
                            <DocumentTitleHandler/>
                        </Refine>
                        {/*<DevtoolsPanel/>*/}
                    </DevtoolsProvider>
                </AntdApp>
            </RefineKbarProvider>
        </BrowserRouter>
    );
}

export default App;
