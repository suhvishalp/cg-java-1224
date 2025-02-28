// src/components/Carousel.js
import React from 'react';

const Carousel = () => {
  return (
    <div id="landingCarousel" className="carousel slide" data-bs-ride="carousel">
      <div className="carousel-inner">
        <div className="carousel-item active">
          <img src="https://via.placeholder.com/1200x400?text=Slide+1" className="d-block w-100" alt="Slide 1" />
        </div>
        <div className="carousel-item">
          <img src="https://via.placeholder.com/1200x400?text=Slide+2" className="d-block w-100" alt="Slide 2" />
        </div>
        <div className="carousel-item">
          <img src="https://via.placeholder.com/1200x400?text=Slide+3" className="d-block w-100" alt="Slide 3" />
        </div>
      </div>
      <button className="carousel-control-prev" type="button" data-bs-target="#landingCarousel" data-bs-slide="prev">
        <span className="carousel-control-prev-icon" aria-hidden="true"></span>
        <span className="visually-hidden">Previous</span>
      </button>
      <button className="carousel-control-next" type="button" data-bs-target="#landingCarousel" data-bs-slide="next">
        <span className="carousel-control-next-icon" aria-hidden="true"></span>
        <span className="visually-hidden">Next</span>
      </button>
    </div>
  );
};

export default Carousel;
