import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class JDBCTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection = null;
		Statement statement;
		
		final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
		final String USERNAME = "root";
		final String PASSWORD = "SuhRoot123";
		
		try {
			//(optional) 1. load database driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. create the connection
			connection = DriverManager.getConnection(DB_URL,USERNAME, PASSWORD);
			
			//3. create statement object 
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			String selectQuery = "SELECT empid, name, city, salary FROM employee";
			
			//4. execute the sql statement / send the sql statement to the database 
			
			ResultSet resultSet = statement.executeQuery(selectQuery);
			
			ResultSetMetaData data = (ResultSetMetaData) resultSet.getMetaData();
						
			resultSet.next();
		
			System.out.println(resultSet.getInt("empid") + " " + resultSet.getString("name") + " " + resultSet.getString("city") + " " + resultSet.getInt("salary"));
			
			resultSet.next();
			
			System.out.println(resultSet.getInt("empid") + " " + resultSet.getString("name") + " " + resultSet.getString("city") + " " + resultSet.getInt("salary"));
			
			resultSet.updateString(3, "Mumbai");
			resultSet.updateRow();
			
			System.out.println(resultSet.getInt("empid") + " " + resultSet.getString("name") + " " + resultSet.getString("city") + " " + resultSet.getInt("salary"));

			
//			while(resultSet.next()) {
//				
//				int empId = resultSet.getInt("empid");
//				String empName = resultSet.getString("name");
//				String city = resultSet.getString("city");
//				int salary = resultSet.getInt("salary");
//				
//				System.out.println(empId + " "+ empName + " " + city + " " + salary);
//				
//			}
			
			resultSet.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				//5. close the connection
				try {
					if(connection!=null)
						connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
