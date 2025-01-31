package com.way2learnonline.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.way2learnonline.model.*;
import com.way2learnonline.repository.*;


public class BankServiceImpl implements BankService {

	@Autowired private AccountService accountService;
	
	@Autowired private PlatformTransactionManager transactionManager;
	

	@Transactional
	public Long transfer(Long fromAccountNumber, Long toAccountNumber, int amount) throws SQLException {
		
		DefaultTransactionDefinition transactionDefinition= new DefaultTransactionDefinition();		
		TransactionStatus transactionStatus=transactionManager.getTransaction(transactionDefinition);
	
		try {
			Long transactionId= accountService.debit(amount,fromAccountNumber);
			accountService.credit(amount, toAccountNumber);

			transactionManager.commit(transactionStatus);
			return transactionId;
			
		} catch (Exception e) {
			
			transactionManager.rollback(transactionStatus);
			throw new RuntimeException(e);
		}
				
				
	}
	
	
	

}
