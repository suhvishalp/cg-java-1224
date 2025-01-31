import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("0131-jpa-demo");
		EntityManager entityManager = factory.createEntityManager();
		
//		Employee employee = new Employee(101, "Isha", "Delhi", 20000.00, "isha@test.com");
		
		//insert a record 
//		entityManager.getTransaction().begin();
//		entityManager.persist(employee);
//		entityManager.getTransaction().commit();
		
		//fetch a record 
//		Employee employee = entityManager.find(Employee.class, 101);
//		System.out.println(employee);
	
		
		//update a record 
//		Employee employee = entityManager.find(Employee.class, 101);
//		System.out.println(employee);
//		
//		entityManager.getTransaction().begin();
//		employee.setCity("Mumabai");
//		employee.setSalary(34500.00);
//		entityManager.getTransaction().commit();
		
//		entityManager.getTransaction().begin();
//		Employee employee = entityManager.find(Employee.class, 101);
//		entityManager.remove(employee);
//		entityManager.getTransaction().commit();
		
		Query selectQuery = entityManager.createQuery("SELECT e From Employee e");
		
		List list = selectQuery.getResultList();
		
		list.forEach(System.out::println);
		
	}

}
