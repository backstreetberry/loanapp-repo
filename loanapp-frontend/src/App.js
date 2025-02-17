import './App.css';
import Home from "./components/Home";
import Login from "./components/Login"
import {BrowserRouter, Routes, Route} from "react-router-dom";
import Signup from './components/Signup';

function App() {
  return (
    <div className="App">
      <h1>Loan Application</h1>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Home/>} />
          <Route path='/login' element={<Login/>} />
          <Route path='/signup' element={<Signup/>} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
