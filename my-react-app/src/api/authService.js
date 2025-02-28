import api from './axiosConfig';

export const loginUser = async (credentials) => {
  // credentials: { email, password }
  return await api.post('/user/authenticate', credentials);
};

export const registerUser = async (data) => {
  return await api.post('/user/register', data);
};


