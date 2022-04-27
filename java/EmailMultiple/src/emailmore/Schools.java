package emailmore;

public class Schools {

	private String name;
	private String email;
	
	public Schools() {
		name = "";
		email = "";
	}
	
	public Schools(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	
	public String toString() {
		
		String str = "You can email " + name + " at " + email; 		
		return str;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setAddress(String email) {
		this.email = email;
	}
}
