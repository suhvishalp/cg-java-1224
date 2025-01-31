import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {

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
			statement = connection.createStatement();
			
			connection.setAutoCommit(false);
			
			//action 1
			String updateQuery = "UPDATE employee SET city='Mumbai' WHERE empid=1";
			
			//4. execute the sql statement / send the sql statement to the database 
			int count = statement.executeUpdate(updateQuery);
			
			if(count>0)
				System.out.println("record is updated");
			
			//another action 2
			
			//one more action 3
			
			connection.commit();
						
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
