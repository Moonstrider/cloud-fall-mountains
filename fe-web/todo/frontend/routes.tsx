import {createBrowserRouter, RouteObject} from 'react-router-dom';
import {TodoView} from "Frontend/views/TodoView";


const routing = [
    {
        path: '/', element: <TodoView/>
    },
] as RouteObject[];

export const routes = routing;
export default createBrowserRouter(routes);
