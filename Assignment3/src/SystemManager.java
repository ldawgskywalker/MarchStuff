import java.util.*;

public class SystemManager {
	private ArrayList<Airport> ap;
	private ArrayList<Airline> al;
	private ArrayList<Flight> fl;

	// CONSTRUCTOR
	public SystemManager() {
		ap = new ArrayList<Airport>();
		al = new ArrayList<Airline>();
		fl = new ArrayList<Flight>();
	}

	// SETTERS AND GETTERS
	public ArrayList<Airport> getAp() {
		return ap;
	}

	public void setAp(ArrayList<Airport> ap) {
		this.ap = ap;
	}

	public ArrayList<Airline> getAl() {
		return al;
	}

	public void setAl(ArrayList<Airline> al) {
		this.al = al;
	}

	public ArrayList<Flight> getFl() {
		return fl;
	}

	public void setFl(ArrayList<Flight> fl) {
		this.fl = fl;
	}
	// END OF SETTERS AND GETTERS//

	// CREATE AIRPORT, ADD TO ARRAYLIST
	public void createAirport(String c) {
		// CHECKS IF CORRECT LENGTH OR IF CONTAINS NUMBER
		int count = 0;
		if (c.length() == 3) {
			Airport airp = new Airport(c);
			// IF NOT IN LIST, ADD
			for (int i = 0; i < ap.size(); i++) {
				if ((ap.get(i).getCode().equals(c))) {
					count++;
				}
			}
			if(count==0)
				ap.add(airp);
		}

	}

	// ADDS AIRLINE TO LIST
	public void createAirline(String n) {
		Airline airl = new Airline(n);
		int count = 0;
		// IF NOT IN LIST, ADDS IT TO LIST
		for (int i = 0; i < al.size(); i++) {
			if ((al.get(i).equals(airl))) {
				count++;
			}
		}
		if(count==0)
			al.add(airl);

	}

	// ADDS FLIGHT TO LIST
	public void createFlight(String aName, String orig, String dest, String id) {
		Airport o = null;
		Airport d = null;
		Airline a = null;
		String i = null;
		// count for number of id's that are the same as given
		int count = 0;
		// find if originating airport is created
		for (int j = 0; j < ap.size(); j++) {
			if (ap.get(j).getCode().equals(orig)) {
				o = ap.get(j);
			}
		}
		// find if dest airport is created
		for (int j = 0; j < ap.size(); j++) {
			if (ap.get(j).getCode().equals(dest)) {
				d = ap.get(j);
			}
		}
		// check if airline exists
		for (int j = 0; j < al.size(); j++) {
			if (al.get(j).getName().equals(aName)) {
				a = al.get(j);
			}
		}
		// checks if id exists
		for (int j = 0; j < fl.size(); j++) {
			if (fl.get(j).getId().equals(id)) {
				count++;
			}
		}
		// if doesn't exist, set i to id
		if (count == 0) {
			i = id;
		}
		// if all exist, create flight
		if (a != null && d != null && o != null && i != null) {
			Flight f = new Flight(i, o, d, a);
			fl.add(f);
		}
	}

	public void createSeats(String a, String id, int num) {
		for (int i = 0; i < fl.size(); i++) {
			if (fl.get(i).getId().equals(id) && fl.get(i).getAirl().getName().equals(a)) {
				fl.get(i).initializeSeats(num);
			}
		}
	}
	//finds flights flying from inputted airports
	public void findAvailableFlights(String orig, String dest) {
		//checks if any flights go from orig to dest
		for (int i = 0; i < fl.size(); i++) {
			if (fl.get(i).getOrig().equals(orig) && fl.get(i).getDest().equals(dest))
				//prints the flights that fill requirements
				System.out.println("Alirline:" + fl.get(i).getAirl() + "ID: " + fl.get(i).getId() + " From: " + orig
						+ " To: " + dest);
		}
	}
	//bookSeat method
	public void bookSeat(String air, String id, int row, char col) {
		for (int i = 0; i < fl.size(); i++) {
			if (fl.get(i).getId().equals(id) && fl.get(i).getAirl().getName().equals(air)) {
				Seats[][] s = fl.get(i).getS();
				//set char value to int value, so can check 2d array
				int c = 0;
				if (col == 'A')
					c = 0;
				if (col == 'B')
					c = 1;
				if (col == 'C')
					c = 2;
				if (col == 'D')
					c = 3;
				if (col == 'E')
					c = 4;
				
				if (s[row][c].isBooked() == false) {
					s[row][c].setBooked(true);
					System.out.println("SUCCESSFULLY BOOKED! Airline: "+air+"\nID: "+id+"\nSeat: "+row+col);
				} else
					System.out.println("Seat taken.");
			}
		}

	}
	
	public void displaySystemDetails(){
		System.out.print("Available Airlines: [");
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i).getName()+" ");
		}
		System.out.print("]\nAirports: [");
		for(int i=0;i<ap.size();i++){
			System.out.print(ap.get(i).getCode()+" ");
		}
		System.out.println("]\nFlights: ");
		for(int i=0;i<fl.size();i++){
			System.out.println("From: "+fl.get(i).getOrig().getCode());
			System.out.print("\tTo: "+fl.get(i).getDest().getCode());
			System.out.println("\nAirline: "+fl.get(i).getAirl().getName());
			System.out.println("\tID: "+fl.get(i).getId());
			System.out.println();
		}
	}
	
}
