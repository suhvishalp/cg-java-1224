// src/hooks/useAxios.js
import { useContext, useMemo } from 'react';
import api from '../api/axiosConfig';
import { AuthContext } from '../contexts/AuthContext';

const useAxios = () => {
  const { user } = useContext(AuthContext);

  const axiosInstance = useMemo(() => {
    // Clone the axios instance if needed, or use the same api instance.
    // Here, we use the same api instance and attach the interceptor.
    api.interceptors.request.use(
      (config) => {
        if (user && user.token) {
          config.headers.Authorization = `Bearer ${user.token}`;
        }
        return config;
      },
      (error) => Promise.reject(error)
    );
    return api;
  }, [user]); // Only changes when the user object changes

  return axiosInstance;
};

export default useAxios;
