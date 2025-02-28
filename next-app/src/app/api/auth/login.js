// pages/api/auth/login.js
export default function handler(req, res) {
    if (req.method === 'POST') {
      // Here you would validate credentials against your backend.
      // For now, simply return a dummy token.
      res.status(200).json({ token: 'dummy-token-for-login' })
    } else {
      res.status(405).json({ message: 'Method Not Allowed' })
    }
  }
  