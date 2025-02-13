package com.demo;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.LineItem;
import com.demo.entities.Order;
import com.demo.repositories.OrderRepository;

@SpringBootTest
public class OrderTest {
	
	
	@Autowired
	private OrderRepository orderRepository;
	
//	@Test
//	public void testCreateOrder() {
//		
//		
//		List<LineItem> lineItemList = List.of(
//				new LineItem("Shoes", 799.00, 1),
//				new LineItem("Gucci", 10000.00, 1),
//				new LineItem("USB Wire", 500.00, 1)
//				);
//		
//		Order order1 = new Order();
//		
//		Date date = new Date(2025, 2, 7);
//		order1.setOrderDate(date);
//		
//		order1.setOrderNumber(1001);
//		order1.setUserName("Isha");
//		order1.setTotalCost(11299.00);
//		
//		order1.setItems(lineItemList);
//		
//		orderRepository.save(order1);
//	}

}
