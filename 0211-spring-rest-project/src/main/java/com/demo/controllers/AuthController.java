package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.JwtUtil;
import com.demo.services.EmployeeDetailsService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private EmployeeDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    // DTO for login request.
    public static class AuthRequest {
        public String email;
        public String password;
    }

    // DTO for login response.
    public static class AuthResponse {
        public String token;
        public AuthResponse(String token) {
            this.token = token;
        }
    }

    @PostMapping("/login")
    public AuthResponse createAuthenticationToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.email, authRequest.password)
            );
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.email);
        // Extract role from the UserDetails (we assume a single role).
        String role = userDetails.getAuthorities().iterator().next().getAuthority().replace("ROLE_", "EMPLOYEE");
        final String token = jwtUtil.generateToken(userDetails.getUsername(), role);
        return new AuthResponse(token);
    }
}
