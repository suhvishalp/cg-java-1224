import './App.css';
import Header from './components/Header';
import MainContent from './components/MainContent';
import MainContentFunctional from './components/MainContentFunctional';

function App() {
  return (
    <div className="container-fuild">

      <div className="row my-header">
         <div className="col-12">
          <Header />
         </div>
      </div>

      <div className="row">
        <div className="col">
          {/* <MainContent /> */}
          <MainContentFunctional />
        </div>
      </div>

    </div>
  );
}

export default App;
