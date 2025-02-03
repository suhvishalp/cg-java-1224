package com.way2learnonline.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import com.way2learnonline.model.*;



public class JpaAccountRepositoryImpl implements AccountRepository {
	
	private DataSource dataSource;	
	
	public JpaAccountRepositoryImpl( DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
	


	public Account findAccountByNumber(Long accountNUmber) throws SQLException {
		//implement this method using jpa
		
		return null;
	}

	public List<Account> findAllAccounts() throws SQLException {
		//implement this method using jpa
		
				return null;
	}

	public void save(Account account) throws SQLException {
		String query="insert into account(name,isactive,city,country,balance,emailaddress) values(?,?,?,?,?,?)";
		Connection connection=dataSource.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, account.getName());
		preparedStatement.setBoolean(2, account.isActive());
		preparedStatement.setString(3, account.getAddress().getCity());
		preparedStatement.setString(4, account.getAddress().getCountry());
		preparedStatement.setInt(5, account.getBalance());
		preparedStatement.setString(6, account.getEmailAddress());
		preparedStatement.executeUpdate();
		
		System.out.println("Account saved");
		
	}

	public void update(Account account) throws SQLException {
		String query="update account set name=?,isactive=?,city=?,country=?,balance=?,emailaddress=? where accountnumber=?";
		Connection connection=dataSource.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, account.getName());
		preparedStatement.setBoolean(2, account.isActive());
		preparedStatement.setString(3, account.getAddress().getCity());
		preparedStatement.setString(4, account.getAddress().getCountry());
		preparedStatement.setInt(5, account.getBalance());
		preparedStatement.setString(6, account.getEmailAddress());
		preparedStatement.setLong(7, account.getAccountNumber());
		preparedStatement.executeUpdate();
		System.out.println("Account updated");
	}

	public void delete(Account account) throws SQLException {
		String query="delete from  account a where  a.accountnumber=?";
		Connection connection=dataSource.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setLong(1, account.getAccountNumber());
		preparedStatement.executeUpdate();
		System.out.println("Account Deleted");
	
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	

}
