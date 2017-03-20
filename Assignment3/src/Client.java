
public class Client {
	public static void main(String[] args){
		
		SystemManager res = new SystemManager();
		
		//create airports
		res.createAirport("YHZ");
		res.createAirport("YYZ");
		res.createAirport("YUL");
		res.createAirport("YVR");
		res.createAirport("YYC");
		res.createAirport("YEG");
		res.createAirport("BOS");
		res.createAirport("JFK");
		
		System.out.println(res.getAp().get(3).getCode());
		
		
		//create airlines
		res.createAirline("AC");
		res.createAirline("DELTA");
		res.createAirline("USAIR");
		res.createAirline("WSJET");
		
		System.out.println(res.getAl().get(1).getName());
		System.out.println(res.getAl().get(2).getName());
		System.out.println(res.getAl().get(3).getName());
		System.out.println(res.getAl().get(4).getName());
		
		//create flights
		res.createFlight("AC", "YHZ", "YUL", "123");
		res.createFlight("AC", "YHZ", "YYZ", "567");
		res.createFlight("AC", "YUL", "YHZ", "789");
		res.createFlight("AC", "YUL", "YVR", "123");
		//invalid – AC cannot have two flights with same id.
		res.createFlight("AC", "YHZ", "YYZ", "689");
		res.createFlight("DELTA", "YHZ", "BOS", "123");
		//etc.
		
		System.out.println(res.getFl().get(3).getId());
		
		//create seats
		res.createSeats("AC", "123", 40);
		res.createSeats("DELTA", "123", 25);
		//etc.
		
		//find available flights
		res.findAvailableFlights("YHZ", "YYZ");
		
		//book seats
		res.bookSeat("AC", "123", 1, 'A');
		res.bookSeat("AC","123",20,'F');
		res.bookSeat("AC", "506", 2, 'B'); //invalid – 506 not created
		res.bookSeat("AC", "123", 55, 'C'); //invalid – row 55 doesn’t exist
		//display system details
		res.displaySystemDetails();
		}
		
	}

