
import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8087/api', // Adjust this base URL as needed.
  headers: {
    'Content-Type': 'application/json',
  },
});

export default api;











