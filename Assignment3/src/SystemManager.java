import java.util.*;
public class SystemManager {
	private ArrayList<Airport> ap;
	private ArrayList<Airline> al;
	private ArrayList<Flight>  fl;
	
	//CONSTRUCTOR
	public SystemManager(){
		ap = new ArrayList<Airport>();
		al = new ArrayList<Airline>();
		fl = new ArrayList<Flight>();
	}
	//SETTERS AND GETTERS
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
	//END OF SETTERS AND GETTERS//
	
	//CREATE AIRPORT, ADD TO ARRAYLIST
	public void createAirport(String c){
		//CHECKS IF CORRECT LENGTH OR IF CONTAINS NUMBER
		if(c.length()==3 ||!c.matches(".*\\d.*")){
			//IF NOT IN LIST, ADD
			for(int i = 0;i<ap.size();i++){
				if(!(ap.get(i).getCode().equals(c))){
					Airport airp = new Airport(c);
					ap.add(airp);
				}	
			}
		}
		
	}
	//ADDS AIRLINE TO LIST
	public void createAirline(String n){
		//IF NOT IN LIST, ADDS IT TO LIST
		for(int i = 0;i<al.size();i++){
			if(!(al.get(i).getName().equals(n))){
				Airline airl = new Airline(n);
				al.add(airl);
			}
		}
		
	}
	//ADDS FLIGHT TO LIST
	public void createFlight(String aName, String orig, String dest, String id){
		Airport o = null;
		Airport d = null;
		Airline a = null;
		//find if originating airport is created
		for(int i = 0;i<ap.size();i++){
			if(ap.get(i).getCode().equals(orig)){
				o = ap.get(i);
			}
		}
		//find if dest airport is created
		for(int i = 0;i<ap.size();i++){
			if(ap.get(i).getCode().equals(dest)){
				d = ap.get(i);
			}
		}
		//check if airline exists
		for(int i = 0;i<al.size();i++){
			if(al.get(i).getName().equals(aName)){
				a = al.get(i);
			}
		}
		//if all exist, create flight
		if(a!=null && d!=null && o!=null) {
			Flight f = new Flight(id, o, d, a);
			fl.add(f);
		} 
	}
	
	public void createSeats(Airline a,String id, int num){
		for(int i=0;i<fl.size();i++){
			if(fl.get(i).getId().equals(id) && fl.get(i).getAirl().equals(a)){
				fl.get(i).initializeSeats(num);
			}
		}
	}
	
	
	

}
