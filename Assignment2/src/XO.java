
public class XO {
	private String name;
	private static int turn;
	//CONSTRUCTOR
	public XO(){
		turn = 1;
		name = "X";
	}
	//GET AND SETS
	public String getName() {
		return name;
	}
	
	public void setName(String n){
		name = n;
	}

	public static int getTurn() {
		return turn;
	}

	public static void setTurn() {
		turn++;
	}
	
	//FIND IF THIS.xo EQUALS INPUT xo
	public boolean equals(XO x){
		if(x.name.equals(this.name))
			return true;
		else
			return false;
	}
	
	//toSTRING
	public String toString(){
		return name;
	}
}
