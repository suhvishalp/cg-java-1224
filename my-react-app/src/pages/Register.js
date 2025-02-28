import React, { useState } from 'react';
import { useForm } from 'react-hook-form';
import { useNavigate, Link } from 'react-router-dom';
import { registerUser } from '../api/authService';

const Register = () => {
  const { register, handleSubmit, formState: { errors } } = useForm();
  const [serverError, setServerError] = useState('');
  const [successMessage, setSuccessMessage] = useState('');
  const navigate = useNavigate();

  const onSubmit = async (data) => {
    try {
      await registerUser(data);
      setSuccessMessage("Registration successful! Redirecting...");
      setTimeout(() => {
        navigate('/user/home');
      }, 2000);
    } catch (error) {
      console.error('Registration error:', error.response);
      if (error.response && error.response.data) {
        const { message, errors: errorDetails } = error.response.data;
        const fieldErrors = errorDetails && errorDetails.map(err => `${err.field}: ${err.message}`).join(', ');
        setServerError(message || fieldErrors || 'Registration failed');
      } else {
        setServerError('Registration failed');
      }
    }
  };

  return (
    <div className="container mt-4">
      <h2>Register</h2>
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
          <label>First Name</label>
          <input 
            type="text" 
            className="form-control" 
            {...register("firstName", { required: "First Name is required" })} 
          />
          {errors.firstName && <span className="text-danger">{errors.firstName.message}</span>}
        </div>
        <div className="mb-3">
          <label>Last Name</label>
          <input 
            type="text" 
            className="form-control" 
            {...register("lastName", { required: "Last Name is required" })} 
          />
          {errors.lastName && <span className="text-danger">{errors.lastName.message}</span>}
        </div>
        <div className="mb-3">
          <label>Password</label>
          <input 
            type="password" 
            className="form-control" 
            {...register("password", { 
              required: "Password is required", 
              minLength: { value: 6, message: "Password must be at least 6 characters" } 
            })} 
          />
          {errors.password && <span className="text-danger">{errors.password.message}</span>}
        </div>
        {serverError && <div className="alert alert-danger">{serverError}</div>}
        {successMessage && <div className="alert alert-success">{successMessage}</div>}
        <button type="submit" className="btn btn-primary">Register</button>
      </form>
      <p className="mt-3">
        Already have an account? <Link to="/login">Login here</Link>
      </p>
    </div>
  );
};

export default Register;
