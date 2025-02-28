// src/pages/AdminUsers.js
import React, { useContext, useEffect, useState } from 'react';
import { AuthContext } from '../../contexts/AuthContext';
import { fetchAllUsers } from '../../api/adminService/adminUserService';
import useFetch from '../../hooks/useFetch';

const AdminUsers = () => {

    //using useFetch() hook
    // const { data: users, error, loading } = useFetch('/admin/users');


    //using useEffect manually
    const { user } = useContext(AuthContext);
    const [users, setUsers] = useState([]);
    const [error, setError] = useState('');
    const [loading, setLoading] = useState(false);
  
    useEffect(() => {
      const loadUsers = async () => {
        try {
          const response = await fetchAllUsers(user.token);
          console.log('userlist', response)
          setUsers(response.data)
        } catch (err) {
          setError('Error fetching users');
        }
      };
  
      loadUsers();
    }, [user.token]);


  if (loading) return <p>Loading users...</p>;
  if (error) return <div className="alert alert-danger">Error fetching users</div>;

  return (
    <div className="container mt-4">
      <h2>All Users</h2>
      {error && <div className="alert alert-danger">{error}</div>}
      {users && users.length > 0 ? (
        <table className="table table-striped">
          <thead>
            <tr>
              <th>ID</th>
              <th>Email</th>
              <th>First Name</th>
              <th>Last Name</th>
            </tr>
          </thead>
          <tbody>
            {users.map((user) => (
              <tr key={user.id}>
                <td>{user.id}</td>
                <td>{user.email}</td>
                <td>{user.firstName}</td>
                <td>{user.lastName}</td>
              </tr>
            ))}
          </tbody>
        </table>
      ) : (
        <p>No users found.</p>
      )}
    </div>
  );
};

export default AdminUsers;
