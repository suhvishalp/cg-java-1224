// src/components/AdminSidebar.js
import React from 'react';
import { Link } from 'react-router-dom';

export default function AdminSidebar() {
  return (
    <div
      className="d-flex flex-column flex-shrink-0 p-3 bg-light"
      style={{ width: '280px', height: '100vh' }}
    >
      <Link
        to="/admin"
        className="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none"
      >
        <span className="fs-4">Admin Dashboard</span>
      </Link>
      <hr />
      <ul className="nav nav-pills flex-column mb-auto">
        <li className="nav-item">
          <Link to="/admin/link1" className="nav-link">
            Admin Link1
          </Link>
        </li>
        <li className="nav-item">
          <Link to="/admin/link2" className="nav-link">
            Admin Link2
          </Link>
        </li>
       <li className="nav-item">
          <Link to="/admin/users" className="nav-link">
            View Users
          </Link>
        </li>
        <li className="nav-item">
          <Link to="/admin/userslist" className="nav-link">
            View All Users
          </Link>
        </li>
      </ul>
    </div>
  );
}
