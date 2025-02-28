import React from 'react';
import useAuth from '../../hooks/useAuth';

const UserHome = () => {
  const { user } = useAuth();
  return (
    <div className="container mt-4">
      <h2>User Dashboard</h2>
      <p>Welcome, {user.firstName} {user.lastName}!</p>
      <div className="row">
        
        <div className="col-md-9">
          <h3>Main Content Area</h3>
          <p>This is where user-specific content will load.</p>
        </div>
      </div>
    </div>
  );
};

export default UserHome;
