
public class FriendList {
	private LinkedList list;
	private int counter;
	
	//CONSTRUCTOR 
	FriendList(){
		list = new LinkedList();
		counter = 0;
	}
	//ADDS USER TO LIST
	public void addUser(User u){
		//CHECKS IF 13 OR OLDER
		if((2017-(u.getBirthYear())>12)){
			list.addToEnd(u);
			counter++;
		}
	}
	//REMOVES USER FROM LIST
	public void removeUser(User u){
		if(list.contains(u)!=-1){
			for(int i=0;i<list.size();i++){
				if(list.get(i).getName().equals(u.getName()))
					list.remove(i);
					counter--;
			}
			
		}
		System.out.println(u.getName()+" has been removed.");
	}
	//RETURNS NUMBER OF USERS ON FRIENDLIST
	public int totalUsers(){
		return counter;
	}
	//RETURNS LIST OF USERS
	public LinkedList getUsers(){
		return list;
	}
	//RETURNS OLDEST FRIEND
	public User oldestFriend(){
		User u=list.get(0);
		
		for(int i=0;i<list.size();i++){
			if(u.getBirthYear()<list.get(i).getBirthYear()){
				u=list.get(i);
			}
		}
		
		return u;
	}
	//FINDS COMMON FRIENDS, ADDS TO LINKEDLIST
	public LinkedList commonFriends(User x, User y){
		LinkedList co = new LinkedList();
		for(int i=0;i<x.getNumFriends();i++){
			for(int j=0;j<y.getFriends().size();j++){
				if(y.getFriends().get(j).equals(x.getFriends().get(i))){
					co.addToEnd(y.getFriends().get(j));
				}
				
			}
				
		}
		return co;
	}
	
}
