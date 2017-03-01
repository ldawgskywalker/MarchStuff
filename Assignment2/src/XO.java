
public class XO {
	private String name;
	private static int turn;
	
	public XO(){
		turn = 0;
		name = "";
	}

	public String getName() {
		return name;
	}

	public void setName() {
		turn++;
		if(turn%2==0){
			name = "O";
		}
		else
			name = "X";
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn() {
		turn++;
	}
	
	public boolean equals(XO x){
		if(x.name.equals(this.name))
			return true;
		else
			return false;
	}
	
	public String toString(){
		return name;
	}
}
