// src/hooks/useFetch.js
import { useState, useEffect } from 'react';
import useAxios from './useAxios';

const useFetch = (url, options = {}) => {
  const axiosInstance = useAxios();
  const [data, setData] = useState(null);
  const [error, setError] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    let isMounted = true;
    axiosInstance
      .get(url, options)
      .then((response) => {
        if (isMounted) setData(response.data);
      })
      .catch((err) => {
        if (isMounted) setError(err);
      })
      .finally(() => {
        if (isMounted) setLoading(false);
      });
    return () => {
      isMounted = false;
    };
  }, [url, options, axiosInstance]);

  return { data, error, loading };
};

export default useFetch;
