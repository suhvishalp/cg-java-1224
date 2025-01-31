package com.way2learnonline.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import com.way2learnonline.domain.Customer;
import com.way2learnonline.utils.CacheUtil;

@SuppressWarnings("unchecked")

 @Component
 public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<Customer> getAllCustomers() throws Exception {		
		
		String methodName="getAllCustomers";
		String key = this.getClass().getMethod(methodName).getReturnType().getName()
					+"getAllCustomers";
		Object returnValue=CacheUtil.cache.get(key);
		
		if(returnValue==null){
			System.out.println("Cache Miss !!! Hitting the DB");
			returnValue=jdbcTemplate.query("Select * from Customers", 
										new BeanPropertyRowMapper<Customer>(Customer.class)) ;
			CacheUtil.cache.put(key, returnValue);
		}else{
			System.out.println("Cache Hit !!! Returning From Cache");
		}
		
		return (List<Customer>) returnValue;
	}

	public Customer getCustomerById(int customerId) throws Exception{

		String methodName="getCustomerById";
		String key = this.getClass().getMethod(methodName,int.class).getReturnType().getName()+"getCustomerById("+customerId+")";
		Object returnValue=CacheUtil.cache.get(key);
		
		if(returnValue==null){
			System.out.println("Cache Miss !!! Hitting the DB");
			returnValue=jdbcTemplate.queryForObject("Select * from Customers where customerId=?", new Object[]{customerId},
													new BeanPropertyRowMapper<Customer>(Customer.class)) ;
			CacheUtil.cache.put(key, returnValue);
		}else{
			System.out.println("Cache Hit !!! Returning From Cache");
		}
		
		return (Customer) returnValue;
		
	}

}
