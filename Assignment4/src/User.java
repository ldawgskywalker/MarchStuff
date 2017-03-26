
public class User {
	private String name;
	private String location;
	private int birthYear;
	private LinkedList friends;
	
	//CONSTRUCTOR
	public User(String n, String l, int by){
		name = n;
		location = l;
		birthYear = by;
		friends = new LinkedList();
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

	public LinkedList getFriends() {
		return friends;
	}

	public void setFriends(LinkedList friends) {
		this.friends = friends;
	}
	
	public int getNumFriends(){
		return friends.size();
	}
	//END OF SETTERS AND GETTERS
	
	//FINDS IF USER IS SAME
	public boolean isEqual(User u){
		if(u.equals(u)){
			return true;
		}
		return false;
	}
	//ADD USER TO LINKEDLIST
	public void addFriend(User u){
		friends.addToEnd(u);
		
		
	}
	//REMOVE USER FROM LINKEDLIST
	public void removeFriend(User u){
		for(int i=0;i<friends.size();i++){
			if(friends.get(i).getName().equals(u.getName()))
				friends.remove(i);
		}
		
	}
	//RETURNS OLDEST USER -- BY AGE -- IN THE LIST
	public User oldestFriend(){
		User u = friends.get(0);
		for(int i=0;i<friends.size();i++){
			if(u.getBirthYear()<friends.get(i).getBirthYear()){
				u=friends.get(i);
			}
				
		}
		return u;
	}
}
