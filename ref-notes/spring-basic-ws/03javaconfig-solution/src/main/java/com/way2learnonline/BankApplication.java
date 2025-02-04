package com.way2learnonline;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import com.way2learnonline.repository.AccountRepository;
import com.way2learnonline.repository.JdbcAccountRepositoryImpl;
import com.way2learnonline.repository.JdbcRewardRepositoryImpl;
import com.way2learnonline.repository.JdbcTransactionRepositoryImpl;
import com.way2learnonline.repository.RewardRepository;
import com.way2learnonline.repository.TransactionRepository;
import com.way2learnonline.service.BankService;
import com.way2learnonline.service.BankServiceImpl;
import com.way2learnonline.service.EmailService;
import com.way2learnonline.service.EmailServiceImpl;

@Configuration
@ComponentScan
@PropertySource("classpath:db.properties")
public class BankApplication {
	
	@Autowired
	private DataSource dataSource;
	
	@Value("classpath:dbscripts.sql")
	private Resource dbscript;
	
	@Autowired
	private Environment env;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(BankApplication.class);
	
		BankService bankService =  context.getBean(BankService.class);
		bankService.transfer(1L, 2L, 5000);
	
	}
	
	@Bean
	public DataSourceInitializer dataSourceInitializer(DataSource dataSource){
		DataSourceInitializer initializer= new DataSourceInitializer();
		initializer.setDataSource(dataSource);
		initializer.setDatabasePopulator(databasePopulator());
		return initializer;
	}
	
	private DatabasePopulator databasePopulator() {
	     ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
	    populator.addScript(dbscript);		   
	    return populator;
	}
	
	@Bean
	public DataSource dataSource(){		
		BasicDataSource dataSource= new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
		dataSource.setUsername("root");
		dataSource.setPassword("SuhRoot123");
		return dataSource;		
	}
}
