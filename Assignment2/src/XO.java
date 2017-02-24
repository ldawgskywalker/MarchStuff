
public class XO {
	private String name;
	private static int turn;
	
	public XO(){
		turn = 1;
		name = "X";
	}

	public String getName() {
		return name;
	}

	public void setName() {
		if(turn%2==0){
			name = "O";
		}
		else
			name = "X";
	}

	public static int getTurn() {
		return turn;
	}

	public static void setTurn(int turn) {
		XO.turn = turn;
	}
	
	public boolean equals(XO x){
		return true;
	}
	
	public String toString(){
		return "";
	}
}
