package com.way2learnonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class AuditService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired private PlatformTransactionManager transactionManager;
	
	
	public void writeAuditLog(String message){
		
		
		DefaultTransactionDefinition transactionDefinition= new DefaultTransactionDefinition();		
		
		transactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
		TransactionStatus transactionStatus=transactionManager.getTransaction(transactionDefinition);
		try {
			
			String query="insert into auditlogs(logmessage) values(?) ";			
			jdbcTemplate.update(query,message);
			
			transactionManager.commit(transactionStatus);
		} catch (Exception e) {
			transactionManager.rollback(transactionStatus);
			
			throw new RuntimeException(e);
		}
		
	}

}
