//this is just for reference, this logic makes a http get request to the backend and adds the Auth header
//can be deleted 

import api from "../axiosConfig"


// This function assumes you already have a valid JWT token and passes it as a header.
export const fetchAllUsers = async (token) => {
  return await api.get('/admin/users', {
    headers: { Authorization: `Bearer ${token}` },
  });
};