import React, { useContext } from 'react';
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import { AuthProvider, AuthContext } from './contexts/AuthContext';
import Navbar from './components/Navbar';
import LandingPage from './pages/LandingPage';
import Login from './pages/Login';
import Register from './pages/Register';
import ProtectedRoute from './components/ProtectedRoute';

// Import the nested layouts and pages
import AdminLayout from './components/AdminLayout';
import AdminLink1 from './pages/admin/AdminLink1';
import AdminLink2 from './pages/admin/AdminLink2';

import UserLayout from './components/UserLayout';
import UserHome from './pages/user/UserHome';
import UserLink1 from './pages/user/UserLink1';
import UserLink2 from './pages/user/UserLink2';
import AdminHome from './pages/admin/AdminHome';
import UserList from './pages/admin/UserList';
import AdminUsers from './pages/admin/AdminUsers';

function AppRoutes() {
  const { user } = useContext(AuthContext);
  
  return (
    <Routes>
      {/* Public Routes */}
      <Route
        path="/"
        element={
          user ? (
            <Navigate to={user.role === 'ADMIN' ? '/admin' : '/user'} replace />
          ) : (
            <LandingPage />
          )
        }
      />
      <Route path="/login" element={<Login />} />
      <Route path="/register" element={<Register />} />

      {/* Protected Admin Routes */}
      <Route path="/admin/*" element={
        <ProtectedRoute allowedRoles={['ADMIN']}>
          <AdminLayout />
        </ProtectedRoute>
      }>
        <Route index element={<AdminHome />} />
        <Route path="link1" element={<AdminLink1 />} />
        <Route path="link2" element={<AdminLink2 />} />
        <Route path="users" element={<AdminUsers />} />
        <Route path='userslist' element={ <UserList />} />
      </Route>

      {/* Protected User Routes */}
      <Route path="/user/*" element={
        <ProtectedRoute allowedRoles={['USER']}>
          <UserLayout />
        </ProtectedRoute>
      }>
        <Route index element={<UserHome />} />
        <Route path="link1" element={<UserLink1 />} />
        <Route path="link2" element={<UserLink2 />} />
      </Route>

      {/* Fallback */}
      <Route path="*" element={<Navigate to="/" replace />} />
    </Routes>
  );
}

function App() {
  return (
    <AuthProvider>
      <Router>
        <Navbar />
        <AppRoutes />
      </Router>
    </AuthProvider>
  );
}

export default App;
