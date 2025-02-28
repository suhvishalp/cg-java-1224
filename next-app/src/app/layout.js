// components/Header.js
import Link from 'next/link'

const Header = () => {
  return (
    <header className="p-3 bg-dark text-white">
      <div className="container">
        <div className="d-flex flex-wrap align-items-center justify-content-between">
          <Link href="/">
            <a className="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
              {/* You can insert a logo here */}
              <span className="fs-4">MyApp</span>
            </a>
          </Link>

          <ul className="nav">
            <li className="nav-item"><Link href="/user/home"><a className="nav-link px-2 text-white">User Home</a></Link></li>
            <li className="nav-item"><Link href="/admin/home"><a className="nav-link px-2 text-white">Admin Home</a></Link></li>
            <li className="nav-item"><Link href="/login"><a className="nav-link px-2 text-white">Login</a></Link></li>
            <li className="nav-item"><Link href="/register"><a className="nav-link px-2 text-white">Register</a></Link></li>
          </ul>
        </div>
      </div>
    </header>
  )
}

export default Header
