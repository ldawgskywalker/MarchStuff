
public class Client {
	public static void main(String[] args){
		
		SystemManager res = new SystemManager();
		
		//create airports
		res.createAirport("YHZ");
		res.createAirport("YYZ");
		res.createAirport("YUL");
		res.createAirport("YVR");
		res.createAirport("YYC");
		res.createAirport("LONDON"); //invalid
		res.createAirport("123"); //invalid
		res.createAirport("YEG");
		res.createAirport("BOS");
		res.createAirport("JFK");
		
	}
}
