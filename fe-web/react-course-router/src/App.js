import './App.css';
import {Route} from "react-router-dom";
import Allmeetups from "./pages/Allmeetups";

function App() {
  return (
      <div className="App">
        <Route path='/'>
          <Allmeetups/>
        </Route>
      </div>
  );
}

export default App;
