import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.junit.Test;



public class DatabaseTest {
	
	@Test
	public void addOneuser() {
		System.out.println("Test: 1-Adding 1 user");
		User user1 = new User ("ID-1","John");
		UserDatabase DB = new UserDatabase();
		DB.addUser(user1);
		assertEquals("Here is the test adding one user",DB.getUsers().get(0),user1);
	}
	

	@Test
	public void addTwoUsers() {
		System.out.println("Test: 2-Adding 2 users");
		User user1 = new User ("ID-1","John");
		User user2 = new User ("ID-2","Mark");
		UserDatabase DB = new UserDatabase();
		DB.addUser(user1);
		DB.addUser(user2);
		
		

		assertEquals("Here is the test adding two users",DB.getUsers().get(0),user1);
		assertEquals("Here is the test adding two users",DB.getUsers().get(1),user2);
	}
	
	@Test
	public void updateUser() {
		System.out.println("Test: 3-Updating User name");
		User user1 = new User ("ID-1","John");
		UserDatabase DB = new UserDatabase();
		DB.addUser(user1);

		
		DB.updateUserName("ID-1", "Matthew");
		assertEquals("User name 1 has been updated",DB.getUsers().get(0).getName(),"Matthew");
	}
	
	@Test
	public void updateUserWithBadId() {
		System.out.println("Test: 4-Updating user with empty data");
		User user1 = new User ("ID-1","John");
		UserDatabase DB = new UserDatabase();
		DB.addUser(user1);

		
		DB.updateUserName("ID-1", "");
		assertEquals("User name 1 has been updated",DB.getUsers().get(0).getName(),"John");
	}

}
