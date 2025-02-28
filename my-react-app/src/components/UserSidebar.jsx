// src/components/UserSidebar.js
import React from 'react';
import { Link } from 'react-router-dom';

export default function UserSidebar() {
  return (
    <div
      className="d-flex flex-column flex-shrink-0 p-3 bg-light"
      style={{ width: '280px', height: '100vh' }}
    >
      <Link
        to="/user"
        className="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none"
      >
        <span className="fs-4">User Dashboard</span>
      </Link>
      <hr />
      <ul className="nav nav-pills flex-column mb-auto">
        <li className="nav-item">
          <Link to="/user/link1" className="nav-link">
            User Link1
          </Link>
        </li>
        <li className="nav-item">
          <Link to="/user/link2" className="nav-link">
            User Link2
          </Link>
        </li>
      </ul>
    </div>
  );
}
