package com.way2learnonline.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
	
	public EmailServiceImpl() {} 

	public void sendMail(String toAddress, String fromAddress, String content) {
		System.out.println("Mail Sent");

	}

}
