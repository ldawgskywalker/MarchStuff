import java.util.*;
public class Play {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		String name1, name2;
		int r, c;
		
		System.out.print("Player 1 name: ");
			name1 = kb.nextLine();
		System.out.print("Player 2 name: ");
			name2 = kb.nextLine();
		
		TicTacToeBoard b = new TicTacToeBoard(3,3);
		XO thing = new XO();
		b.setUp(thing);
		
		
		
		
		System.out.println(name1+" - you are X's. Go first.");
		
		
		System.out.println(b.toString());
		
		System.out.print("Please input row# between 1-3 and a Column# btween 1-3: ");
			r = kb.nextInt();
			c = kb.nextInt();
			
		if(b.add(r-1, c-1)){
			b.add(r,c,thing);
		}

		System.out.println(b.toString());
			
		/*while(!b.winner()){
			thing.setName();
			if(thing.getTurn()%2==0){
				System.out.println(name2+"");
			}
			
			thing.setTurn();
		}*/
				
		
		
		kb.close();
	}
}
