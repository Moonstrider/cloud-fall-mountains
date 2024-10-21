import {Route} from "react-router-dom";
import Allmeetups from "@/pages/Allmeetups";

export default function Home() {
  return (

      <div>
        <Route path='/'>
          <Allmeetups/>
        </Route>

      </div>


  );
}
