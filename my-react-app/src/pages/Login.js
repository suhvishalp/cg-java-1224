import React, { useState, useContext } from 'react';
import { useForm } from 'react-hook-form';
import { useNavigate, Link } from 'react-router-dom';
import { AuthContext } from '../contexts/AuthContext';
import { loginUser } from '../api/authService';
import { jwtDecode } from 'jwt-decode';

const Login = () => {
  const { register, handleSubmit, formState: { errors } } = useForm();
  const [serverError, setServerError] = useState('');
  const navigate = useNavigate();
  const { login } = useContext(AuthContext);

  const onSubmit = async (data) => {
    try {
      const response = await loginUser(data);
      console.log('API login response:', response.data);
      // Use the accessToken from the response
      const rawToken = response.data.accessToken;
      const token = rawToken.trim();
      const decoded = jwtDecode(token);
      console.log('Decoded token:', decoded);
      
      // Build user data from the decoded payload.
      // Adjust field names as per your token payload.
      const userData = {
        token,
        firstName: decoded.firstName || "User",
        lastName: decoded.lastName || "",
        email: decoded.sub,
        // If role is an array, we take the first element:
        role: Array.isArray(decoded.role) ? decoded.role[0] : decoded.role,
      };

      login(userData);
      if (userData.role === 'ADMIN') {
        navigate('/admin');
      } else {
        navigate('/user');
      }
    } catch (error) {
      console.error('Login error:', error.response);
      if (error.response && error.response.data) {
        const { message, errors: errorDetails } = error.response.data;
        // Combine field errors if present:
        const fieldErrors = errorDetails && errorDetails.map(err => `${err.field}: ${err.message}`).join(', ');
        setServerError(message || fieldErrors || 'Login failed');
      } else {
        setServerError('Login failed');
      }
    }
  };

  return (
    <div className="container mt-4">
      <h2>Sign In</h2>
      <form onSubmit={handleSubmit(onSubmit)} noValidate>
        <div className="mb-3">
          <label>Email</label>
          <input 
            type="email" 
            className="form-control" 
            {...register("email", { required: "Email is required" })} 
          />
          {errors.email && <span className="text-danger">{errors.email.message}</span>}
        </div>
        <div className="mb-3">
          <label>Password</label>
          <input 
            type="password" 
            className="form-control" 
            {...register("password", { required: "Password is required" })} 
          />
          {errors.password && <span className="text-danger">{errors.password.message}</span>}
        </div>
        {serverError && <div className="alert alert-danger">{serverError}</div>}
        <button type="submit" className="btn btn-primary">Login</button>
      </form>
      <p className="mt-3">
        Don't have an account? <Link to="/register">Register here</Link>
      </p>
    </div>
  );
};

export default Login;
