// pages/register.js
import { useForm } from 'react-hook-form'
import Layout from '../components/Layout'
import { useRouter } from 'next/router'

export default function Register() {
  const { register, handleSubmit, formState: { errors } } = useForm()
  const router = useRouter()

  const onSubmit = async (data) => {
    // Replace with your API endpoint
    const res = await fetch('/api/auth/register', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(data)
    })
    if (res.ok) {
      // Redirect or notify user
      router.push('/login')
    } else {
      alert('Registration failed')
    }
  }

  return (
    <Layout>
      <h2>Register</h2>
      <form onSubmit={handleSubmit(onSubmit)}>
        <div className="mb-3">
          <label>Email</label>
          <input type="email" className="form-control" {...register("email", { required: true })} />
          {errors.email && <span className="text-danger">Email is required</span>}
        </div>
        <div className="mb-3">
          <label>First Name</label>
          <input type="text" className="form-control" {...register("firstName", { required: true })} />
          {errors.firstName && <span className="text-danger">First Name is required</span>}
        </div>
        <div className="mb-3">
          <label>Last Name</label>
          <input type="text" className="form-control" {...register("lastName", { required: true })} />
          {errors.lastName && <span className="text-danger">Last Name is required</span>}
        </div>
        <div className="mb-3">
          <label>Password</label>
          <input type="password" className="form-control" {...register("password", { required: true })} />
          {errors.password && <span className="text-danger">Password is required</span>}
        </div>
        <button type="submit" className="btn btn-primary">Register</button>
      </form>
    </Layout>
  )
}
