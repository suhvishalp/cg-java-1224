import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import Header from './components/Header';
import MainContent from './components/MainContent';
import MainContentFunctional from './components/MainContentFunctional';
import CreateEmployeeForm from './components/CreateEmployeeForm';

function App() {
  return (
    <div className="container-fuild">

      <div className="row my-header">
         <div className="col-12">
          <Header />
         </div>
      </div>

      <div className="row">
        <div className="col-9">
          {/* <MainContent /> */}
          {/* <MainContentFunctional /> */}
          
          <BrowserRouter>
            <Routes>
              <Route path='/' element={ <CreateEmployeeForm /> } />
              <Route path='/list' element={ <MainContentFunctional /> } />
            </Routes>
          </BrowserRouter>
        </div>
      </div>

    </div>
  );
}

export default App;
