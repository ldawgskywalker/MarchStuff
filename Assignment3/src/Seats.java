
public class Seats {
	private int num;
	private char let;
	private boolean booked;

	//CONSTRUCTOR
	public Seats(int n, int l){
		num = n+1;
		if(l==0){
			let = 'A';
		}
		if(l==1){
			let = 'B';
		}
		if(l==2){
			let = 'C';
		}
		if(l==3){
			let = 'D';
		}
		if(l==4){
			let = 'E';
		}
		booked = false;
	}
	
	//SETTERS AND GETTERS
	public int getNum() {
		return num;
	}

	public boolean isBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public char getLet() {
		return let;
	}

	public void setLet(char let) {
		this.let = let;
	}
	//END OF SETTERS AND GETTERS
	
	
}
