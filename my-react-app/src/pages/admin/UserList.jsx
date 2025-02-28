//This is just for reference - can be deleted


import React, { useContext, useEffect, useState } from 'react';
import { AuthContext } from '../../contexts/AuthContext';
import { fetchAllUsers } from '../../api/adminService/adminUserService';

const UserList = () => {

    const { user } = useContext(AuthContext);
    const [userData, setUserData] = useState([]);

    useEffect(()=>{
        console.log('fetching users from backend')

       
        const loadAllUsers = async ()  => {
         const response = await fetchAllUsers(user.token)
            console.log('userlist received: ', response.data)
          setUserData(response.data)
        }

        loadAllUsers();

    }, [])
  
    return (
        <div className="container mt-4">
            <h1>Showing all the users </h1>
        </div>
    );
};

export default UserList;