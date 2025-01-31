package com.way2learnonline.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.way2learnonline.dao.CustomerDao;
import com.way2learnonline.domain.Customer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:application-config.xml","classpath:test-infrastructure-config.xml"})
public class CustomerDaoTests {
	
	@Autowired
	private CustomerDao customerDao;



	@Test
	public void testGetCustomerById() throws Exception {
		Customer customer=customerDao.getCustomerById(1);
		assertNotNull(customer);
		customerDao.getCustomerById(1);
		customerDao.getCustomerById(1);
	}

}
