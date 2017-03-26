import java.util.*;
import java.io.*;
public class Demo {
	public static void main(String[] args) throws IOException{
		Scanner kb = new Scanner(System.in);
		int input=0;
		
		//SETUP FRIENDSLIST AND USER
		FriendList f = new FriendList();
		Scanner text = new Scanner(new File("users"));
		
		while(text.hasNext()){
			User u = new User(text.next(),text.next(),text.nextInt());
			f.addUser(u);
		}
		

		while(input!=12){
			System.out.println("Welcome to FriendList! What would you	like to	do (press a number)?"	
							+"\n1.	Print out all the users."
							+"\n2.	Print the	total number of	users."
							+"\n3.	Print out all the friends of a user."
							+"\n4.	Add	a	new	user."	
							+"\n5.	Remove a user."
							+"\n6.	Add	a friend."
							+"\n7.	Remove a friend."
							+"\n8.	Print the user with most friends."
							+"\n9.	Find common friends	between	two	friends."
							+"\n10.	Find the oldest	friend for a user."
							+"\n11.	Find the user with the oldest friend on	FriendList."
							+"\n12.	Quit.");
							input=kb.nextInt();
			//prints all users
			if(input==1){
				f.getUsers().enumerate();
			}
			//prints total num of users
			if(input==2){
				System.out.println("There are "+f.totalUsers()+" users.");
			}
			//prints friends of user
			if(input==3){
				System.out.print("Enter a name of a user: ");
					String name = kb.nextLine();
				User u=null;
				for(int i=0;i<f.getUsers().size();i++){
					if(f.getUsers().get(i).getName().equals(name)){
						u = f.getUsers().get(i);
					}
					
				}
				if(u!=null){
					System.out.println(name+" friends: ");
					u.getFriends().enumerate();
				}
			}
			//add new user
			if(input==4){
				System.out.print("Enter name, hometown, and and birth year: ");
					User u=new User(kb.next(),kb.next(), kb.nextInt());
				f.addUser(u);
			}
			//remove user
			if(input==5){
				System.out.println("Enter a name of a user: ");
					String r = kb.next();
				for(int i=0;i<f.getUsers().size();i++){
					if(f.getUsers().get(i).getName().equals(r)){
						f.removeUser(f.getUsers().get(i));
					}
				}
			}
			//create friend
			if(input==6){
				System.out.println("To create a friend you must input two names.");
				System.out.print("Please input the first name: ");
					String n1=kb.next();
				System.out.print("Please input the second name: ");
					String n2=kb.next();
				
				int x=-1,y=-1;
				for(int i=0;i<f.getUsers().size();i++){
					if(f.getUsers().get(i).getName().equals(n1)){
						x=i;
					}
					if(f.getUsers().get(i).getName().equals(n2)){
						y=i;
					}
				}
				if(x==-1 || y==-1){
					System.out.println("Friend(s) do not exist");
				}
				else{
					User u1 = f.getUsers().get(x);
					User u2 = f.getUsers().get(y);
					u1.addFriend(u2);
					u2.addFriend(u1);
					System.out.println(u1.getName()+" has added "+u2.getName()+" as a friend.");
				}
			}
			//remove friend
			if(input==7){
				System.out.println("To remove a friend you must input two names.");
				System.out.print("Please input the first name: ");
					String n1=kb.next();
				System.out.print("Please input the second name: ");
					String n2=kb.next();
				
				int x=-1,y=-1;
				for(int i=0;i<f.getUsers().size();i++){
					if(f.getUsers().get(i).getName().equals(n1)){
						x=i;
					}
					if(f.getUsers().get(i).getName().equals(n2)){
						y=i;
					}
				}
				if(x==-1 || y==-1){
					System.out.println("Friend(s) do not exist");
				}
				else{
					User u1 = f.getUsers().get(x);
					User u2 = f.getUsers().get(y);
					u1.removeFriend(u2);
					u2.removeFriend(u1);
					System.out.println(u1.getName()+" has removed "+u2.getName()+" as a friend.");
				}
			}
			//user with most friends
			if(input==8){
				User most = f.getUsers().get(0);
				for(int i=0;i<f.getUsers().size();i++){
					if(f.getUsers().get(i).getNumFriends()>most.getNumFriends()){
						most=f.getUsers().get(i);
					}
				}
				System.out.print(most.getName()+" has the most friends.");
			}
			//find mutual friends
			if(input==9){
				System.out.print("Please input the first name: ");
					String n1=kb.next();
				System.out.print("Please input the second name: ");
					String n2=kb.next();
			
					int x=-1,y=-1;
				for(int i=0;i<f.getUsers().size();i++){
					if(f.getUsers().get(i).getName().equals(n1)){
						x=i;
					}
					if(f.getUsers().get(i).getName().equals(n2)){
						y=i;
					}
				}
				if(x==-1 || y==-1){
					System.out.println("Do not exist");
				}
				else{
					User u1 = f.getUsers().get(x);
					User u2 = f.getUsers().get(y);
					f.commonFriends(u1, u2).enumerate();
				}				
			}
			//oldest friend
			if(input==10){
				System.out.print("Input user's name: ");
					String n=kb.next();
				User u;
				for(int i=0;i<f.getUsers().size();i++){
					if(f.getUsers().get(i).getName().equals(n)){
						 u=f.getUsers().get(i);
						 System.out.print(u.oldestFriend().getName());
					}
				}
				System.out.println(" is "+n+"'s oldest friend.");
				
			}
			//finds user with oldest friend
			if(input==11){
				User u = f.getUsers().get(0);
				for(int i=0;i<f.getUsers().size()-1;i++){
					if(u.oldestFriend().getBirthYear()>f.getUsers().get(i).oldestFriend().getBirthYear()){
						u=f.getUsers().get(i);
					}
				}
				System.out.println(u.getName()+" has the oldest friend.");
			}
			//exit
			if(input==12){
				System.exit(0);
			}
			
		}
		
		
		//close
		text.close();
		kb.close();
	}
}
