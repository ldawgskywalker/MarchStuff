import java.util.*;
public class User {
	private String name;
	private String location;
	private int birthYear;
	private LinkedList<User> friends;
	
	//CONSTRUCTOR
	public User(String n, String l, int by){
		name = n;
		location = l;
		birthYear = by;
		friends = new LinkedList<User>();
	}
	//SETTERS AND GETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public LinkedList<User> getFriends() {
		return friends;
	}

	public void setFriends(LinkedList<User> friends) {
		this.friends = friends;
	}
	
	public int getNumFriends(){
		return friends.size();
	}
	//END OF SETTERS AND GETTERS
	
	//FINDS IF USER IS SAME
	public boolean isEqual(User u){
		//TODO: This Method
		return false;
	}
	
	public void addFriend(User u){
		friends.addLast(u);
		
	}
}
