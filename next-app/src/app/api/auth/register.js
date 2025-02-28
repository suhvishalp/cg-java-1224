// pages/api/auth/register.js
export default function handler(req, res) {
    if (req.method === 'POST') {
      // Simulate registration
      res.status(200).json({ message: 'Registration successful' })
    } else {
      res.status(405).json({ message: 'Method Not Allowed' })
    }
  }
  