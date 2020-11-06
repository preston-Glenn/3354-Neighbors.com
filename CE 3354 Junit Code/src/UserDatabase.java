import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
	List<User> DB = new ArrayList<>();
	
	
	
	public void addUser(User user)
	{
		DB.add(user);
	};
	
	public void updateUserName(String Id, String newName) {
		if(newName == "" || Id == "")
			return;
		DB.forEach((ele) -> {
			if(ele.getId()==Id) {
				ele.setName(newName);
			}
			}
			);
		
	}
	
	public void printUsers() {
		DB.forEach((ele) -> {
		System.out.println(ele.getName());
		System.out.println(ele.getId());}
		);
		
	}
	
	public List<User> getUsers() {
		return this.DB;
	}
	

	public static void main(String[] args) {
		User a = new User("123","John Cenna");
		UserDatabase DB = new UserDatabase();
		DB.addUser(a);
		DB.printUsers();
		
		DB.updateUserName("123", "Preston Glenn");
		DB.printUsers();
	}
}


