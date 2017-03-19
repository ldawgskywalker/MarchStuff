
public class Seats {
	private int num;
	private String let;

	//CONSTRUCTOR
	public Seats(int n, int l){
		num = n+1;
		if(l==0){
			let = "A";
		}
		if(l==1){
			let = "B";
		}
		if(l==2){
			let = "C";
		}
		if(l==3){
			let = "D";
		}
		if(l==4){
			let = "E";
		}
	}
	
	//SETTERS AND GETTERS
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getLet() {
		return let;
	}

	public void setLet(String let) {
		this.let = let;
	}
	//END OF SETTERS AND GETTERS
	
	
}
