import java.util.*;
public class FriendList {
	private LinkedList<User> list;
	private int counter;
	
	//CONSTRUCTOR 
	FriendList(){
		list = new LinkedList<User>();
		counter = 0;
	}
	//ADDS USER TO LIST
	public void addUser(User u){
		//CHECKS IF 13 OR OLDER
		if((2017-(u.getBirthYear())>12)){
			list.add(u);
			counter++;
		}
	}
	//REMOVES USER FROM LIST
	public void removeUser(User u){
		
		counter--;
	}
	//RETURNS NUMBER OF USERS ON FRIENDLIST
	public int totalUsers(){
		return counter;
	}
	//RETURNS LIST OF USERS
	public LinkedList<User> getUsers(){
		return list;
	}
	//RETURNS OLDEST FRIEND
	public User oldestFriend(){
		User u=list.getFirst();
		
		for(int i=0;i<list.size();i++){
			if(u.getBirthYear()<list.get(i).getBirthYear()){
				u=list.get(i);
			}
		}
		
		return u;
	}
	//FINDS COMMON FRIENDS
	public LinkedList<User> commonFriends(User x, User y){
		LinkedList<User> co = new LinkedList<User>();
		//TODO: FIX THIS METHOD
		return co;
	}
	
}
