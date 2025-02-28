// components/Layout.js
import Header from './Header'
import Sidebar from './Sidebar'

const Layout = ({ children }) => {
  return (
    <>
      <Header />
      <div className="d-flex">
        <Sidebar />
        <main className="flex-grow-1 p-3">
          {children}
        </main>
      </div>
    </>
  )
}

export default Layout
