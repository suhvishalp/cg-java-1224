import React from 'react';
import useAuth from '../../hooks/useAuth';

const AdminHome = () => {
  const { user } = useAuth();
  return (
    <div className="container mt-4">
      <div className="row">
        
        <div className="col-md-9">
          <h3>Main Content Area</h3>
          <p>This is where admin-specific content will load.</p>
        </div>
      </div>
    </div>
  );
};

export default AdminHome;
