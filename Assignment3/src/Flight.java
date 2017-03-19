
public class Flight {
	private Airport orig;
	private Airport dest;
	private Airline airl;
	private String 	id;
	private Seats[][] s;
	
	//CONSTRUCTOR
	public Flight(String i, Airport o, Airport d, Airline a){
		id 	 = i;
		orig = o;
		dest = d;
		airl = a;
	}
	
	//SETTERS AND GETTERS
	public Airport getOrig() {
		return orig;
	}

	public void setOrig(Airport orig) {
		this.orig = orig;
	}

	public Airport getDest() {
		return dest;
	}

	public void setDest(Airport dest) {
		this.dest = dest;
	}

	public Airline getAirl() {
		return airl;
	}

	public void setAirl(Airline airl) {
		this.airl = airl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Seats[][] getS() {
		return s;
	}

	public void setS(Seats[][] s) {
		this.s = s;
	}
	//END OF SETTERS AND GETTERS//
	
	public void initializeSeats(int n){
		s = new Seats[n][5];
		for(int i=0; i<n;i++){
			for(int j=0; j<5; j++){
				Seats st = new Seats(i,j);
				s[i][j] = st;
			}
		}
	}
	
}
