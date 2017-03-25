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
		counter++;
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
		//TODO: FIX THIS METHOD
		return ;
	}
	//FINDS COMMON FRIENDS
	public LinkedList<User> commonFriends(User x, User y){
		LinkedList<User> co = new LinkedList<User>();
		//TODO: FIX THIS METHOD
		return co;
	}
	
}
