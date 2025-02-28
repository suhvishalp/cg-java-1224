// pages/login.js
import { useForm } from 'react-hook-form'
import Layout from '../components/Layout'
import { useRouter } from 'next/router'

export default function Login() {
  const { register, handleSubmit, formState: { errors } } = useForm()
  const router = useRouter()

  const onSubmit = async (data) => {
    // Replace with your API endpoint
    const res = await fetch('/api/auth/login', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(data)
    })
    if (res.ok) {
      // Save token to localStorage/cookie as needed and redirect
      router.push('/user/home')
    } else {
      // Handle error
      alert('Login failed')
    }
  }

  return (
    <Layout>
      <h2>Login</h2>
      <form onSubmit={handleSubmit(onSubmit)}>
        <div className="mb-3">
          <label>Email</label>
          <input type="email" className="form-control" {...register("email", { required: true })} />
          {errors.email && <span className="text-danger">Email is required</span>}
        </div>
        <div className="mb-3">
          <label>Password</label>
          <input type="password" className="form-control" {...register("password", { required: true })} />
          {errors.password && <span className="text-danger">Password is required</span>}
        </div>
        <button type="submit" className="btn btn-primary">Login</button>
      </form>
    </Layout>
  )
}
