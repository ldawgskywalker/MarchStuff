import java.util.*;
public class Play {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		String name1, name2;
		//VARIABLES FOR ROW AND COLUMN 
		int r, c;
		
		//PLAYERS INPUT NAMES
		System.out.print("Player 1 name: ");
			name1 = kb.nextLine();
		System.out.print("Player 2 name: ");
			name2 = kb.nextLine();
		//CREATES NEW TICTACTOEBOARD
		TicTacToeBoard b = new TicTacToeBoard(3,3);
		//CREATE X'S
		XO x = new XO();
		//CREATE O'S
		XO o = new XO();
		o.setName("O");
		
		
		
		
		System.out.println(name1+" - you are X's. Go first.");
		
		
		System.out.println(b);
		
		//USER 1 INPUTS COLUMN AND ROW WHICH 
		System.out.print("Please input row# between 1-3 and a Column# between 1-3: ");
			r = kb.nextInt();
			c = kb.nextInt();
			
			b.add(r-1,c-1,x);
		
			
		System.out.println(b);
		
		//WHILE NO WINNER, REPEAT
		while(!b.winner()){
			if(b.getTurnCnt()%2==0){
				System.out.println(name2+", it is your turn.");
				System.out.print("Please input row# between 1-3 and a Column# between 1-3: ");
					r = kb.nextInt();
					c = kb.nextInt();
				//IF RQUESTED SPACE FILLED, RE INPUT VALUES
				while(!b.add(r-1, c-1)){
					System.out.print("INVALID ENTRY. PLEASE RE-ENTER: ");
						r = kb.nextInt();
						c = kb.nextInt();
				}
				//ADD O TO REQUESTED SPACE
				b.add(r-1,c-1,o);
			}
			else{
				System.out.println(name1+", it is your turn.");
				System.out.print("Please input row# between 1-3 and a Column# between 1-3: ");
					r = kb.nextInt();
					c = kb.nextInt();
				//IF RQUESTED SPACE FILLED, RE INPUT VALUES
				while(!b.add(r-1, c-1)){
					System.out.print("INVALID ENTRY. PLEASE RE-ENTER: ");
						r = kb.nextInt();
						c = kb.nextInt();
				}
				//ADD X TO REQUESTED SPACE
				b.add(r-1,c-1,x);
			}
			
			System.out.println(b);
			XO.setTurn();
			b.setTurnCnt();
		}
		
		//CONGRATULATE WINNER
		System.out.print("Congratulations, ");
		if((b.getTurnCnt()-1)%2==0)
			System.out.print(name2);
		else
			System.out.print(name1);
		System.out.print("! You have won!");
		
		//CLOSE SCANNER
		kb.close();
	}
}
