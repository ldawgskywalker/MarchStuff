import java.util.*;
public class Client {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		int select=0;
		
		SystemManager res = new SystemManager();
		
		//create airports
		res.createAirport("ANR");
		res.createAirport("DUB");
		res.createAirport("ANR");
		res.createAirport("MAN");
		res.createAirport("YHZ");
		res.createAirport("THIS WILL BE TOO LONG");//INVALID - TOO LONG
		res.createAirport("BOS");
		res.createAirport("EWR");		
		
		//create airlines
		res.createAirline("ROO");
		res.createAirline("JBU");
		res.createAirline("JAA");
		res.createAirline("WSJET");
		
		//create flights
		res.createFlight("ROO", "DUB", "EWR", "777");
		res.createFlight("JAA", "MAN", "BOS", "147");
		res.createFlight("JBU", "AAA", "YHZ", "564");//INVALID - NO AAA LOCATION
		res.createFlight("JAA", "YHZ", "ANR", "663");
		res.createFlight("ROO", "DUB", "EWR", "777");//INVALID - ALREADY CREATED
		res.createFlight("WSJET", "YHZ", "BOS", "123");
		
		//create seats
		res.createSeats("ROO", "777", 25);
		res.createSeats("JAA", "147", 45);
		res.createSeats("JAA", "663", 60);
		res.createSeats("WSJET", "123", 23);
		res.createSeats("ROO", "222", 45);//INVALID - FLIGHT DOESN'T EXIST
		
		//MENU
		while(select!=-1){
			System.out.print("Input number for what you would like to do:\n"
					+ "1.Check Airlines\n"
					+ "2.Check Airports\n"
					+ "3.Check Flights\n"
					+ "4.Book Flights\n"
					+ "-1. Exit\n");
				select=kb.nextInt();
			if(select==1){
				System.out.print("AIRLINES: [");
				for(int i=0;i<res.getAl().size();i++){
					System.out.print(res.getAl().get(i).getName()+" ");
				}
				System.out.println("]");

			}
			if(select==2){
				System.out.print("Airports: [");
				for(int i=0;i<res.getAp().size();i++){
					System.out.print(res.getAp().get(i).getCode()+" ");
				}
				System.out.println("]");
			}
			if(select==3){
				System.out.print("FLIGHTS: ");
				for(int i=0;i<res.getFl().size();i++){
					System.out.println("From: "+res.getFl().get(i).getOrig().getCode());
					System.out.print("\tTo: "+res.getFl().get(i).getDest().getCode());
					System.out.println("\nAirline: "+res.getFl().get(i).getAirl().getName());
					System.out.println("\tID: "+res.getFl().get(i).getId());
					System.out.println();
				}
				System.out.println();

			}
			if(select==4){
				String a, id;
				char c;
				int row;
				
				System.out.print("To book a seat, input the name of the Airline you wish to travel with, "
						+ "the Flight ID, the row number, and letter of seat: ");
					a   = kb.next();
					id  = kb.next();
					row = kb.nextInt();
					c 	= kb.next().charAt(0);
					
					res.bookSeat(a, id, row, c);
					
			}
			
				
		}
		res.displaySystemDetails();
		
		kb.close();
	}
		
}

