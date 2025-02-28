// src/components/UserLayout.js
import React from 'react';
import { Outlet } from 'react-router-dom';
import UserSidebar from './UserSidebar';

const UserLayout = () => {
  return (
    <div className="d-flex">
      <UserSidebar />
      <div className="flex-grow-1 p-3">
        <Outlet />
      </div>
    </div>
  );
};

export default UserLayout;
