
public class User {
	private String id;
	private String name;
	
	public User(String ID,String Name) {
		this.id = ID;
		this.name = Name;
	}
	
	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
