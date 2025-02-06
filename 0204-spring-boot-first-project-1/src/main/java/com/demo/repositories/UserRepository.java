package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("SELECT u FROM User u WHERE u.email = :email ")
	User fetchUserByEmail(@Param("email") String email);
//	
	
//	@Query(name = "Select * from user where email =?", nativeQuery = true)
//	User fetchUserByEmail1(@Param("email") String email);
	
	
//	//fetch all users who's email ends with gmail.com"
//	@Query("SELECT u From User u WHERE u.email LIKE %:emailDomain")
//	List<User> fetchAllUsersByEmailDomain(String emailDomain);
	
	User findByEmail(String email);
	User findByName(String name);
	
	User findByNameAndEmail(String name, String email);
	
	List<User> findAllByEmailContaining(String email);
	
	boolean existsByEmail(String email);

}

//Spring Data Jpa provides a proxy instance of this interface