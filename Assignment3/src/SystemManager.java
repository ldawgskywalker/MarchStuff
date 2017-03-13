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
		Airport a = new Airport(c);
		
		ap.add(a);
	}
	
	public void createAirline(String n){
		
	}
	
	
	

}
