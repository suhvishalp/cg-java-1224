// src/pages/LandingPage.js
import React from 'react';
import Navbar from '../components/Navbar';
import Carousel from '../components/Carousel';

const LandingPage = () => {
  return (
    <>
      <div className="container mt-4">
        <Carousel />
        <div className="mt-4">
          <h1>Welcome to MyProject</h1>
          <p>This is the landing page. Please sign in or register to continue.</p>
        </div>
      </div>
    </>
  );
};

export default LandingPage;
