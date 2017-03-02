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
		XO x = new XO();
		XO o = new XO();
		o.setName("O");
		
		
		
		
		System.out.println(name1+" - you are X's. Go first.");
		
		
		System.out.println(b);
		
		System.out.print("Please input row# between 1-3 and a Column# between 1-3: ");
			r = kb.nextInt();
			c = kb.nextInt();
			
		
			b.add(r-1,c-1,x);
		

		System.out.println(b);
			
		while(!b.winner()){
			if(XO.getTurn()%2==0){
				System.out.println(name2+", it is your turn.");
				System.out.print("Please input row# between 1-3 and a Column# between 1-3: ");
				r = kb.nextInt();
				c = kb.nextInt();
				b.add(r-1,c-1,o);
			}
			else{
				System.out.println(name1+", it is your turn.");
				System.out.print("Please input row# between 1-3 and a Column# between 1-3: ");
				r = kb.nextInt();
				c = kb.nextInt();
				b.add(r-1,c-1,x);
			}
			
			System.out.println(b);
			XO.setTurn();
			b.setTurnCnt();
		}
				
		
		
		kb.close();
	}
}
