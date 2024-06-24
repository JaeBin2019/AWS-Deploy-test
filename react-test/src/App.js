import React from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

function App() {
  const handleButtonClick = async () => {
    try {
      const response = await axios.get('https://api.techeer.site/db');
      console.log('Response:', response.data);
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  };

  return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <a
              className="App-link"
              href="https://reactjs.org"
              target="_blank"
              rel="noopener noreferrer"
          >
            Learn React
          </a>
          <button onClick={handleButtonClick} className="App-button">
            Fetch Data
          </button>
        </header>
      </div>
  );
}

export default App;
