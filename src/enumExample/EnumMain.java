package enumExample;



import java.util.Scanner;

import enumExample.Flight.FlightType;

public class EnumMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Flight Booking application");

		Flight airCanadaDomestic = new Flight("Air Canada Domestic", 100, FlightType.DOMESTIC);
		Flight airCanadaInternational = new Flight("Air Canada International", 200, FlightType.INTERNATIONAL);
		Flight airFranceInternational = new Flight("Air France International", 300, FlightType.INTERNATIONAL);
		Flight airFranceDomestic = new Flight("Air France Domestic", 150, FlightType.DOMESTIC);

		Flight[] allFlights = { airCanadaDomestic, airCanadaInternational, airFranceDomestic, airFranceInternational };
		Flight[] filteredFlights = new Flight[2];
		System.out.println("Enter name of Passenger");
		String name = sc.next();

		System.out.println("Enter id details");
		String id = sc.next();

		Passenger manvir = new Passenger(name, id, null);

		System.out.println("Which type of flight you want to book");
		String typeOfFlight = sc.next();
		FlightType type = null;

		switch (typeOfFlight) {
		case "Domestic":
			type = FlightType.DOMESTIC;
			break;
		case "International":
			type = FlightType.INTERNATIONAL;
			break;

		default:
			System.out.println("Not a valid case");
			break;
		}

		int counter = 0;
		for (int j = 0; j < allFlights.length; j++) {
			if (allFlights[j].typeOfFlight.getTypeOfFlight().equals(type.getTypeOfFlight())) {

				filteredFlights[counter] = allFlights[j];
				counter++;
				
				if(filteredFlights.length==counter) {
					break;
				}

			}

		}

	}

}
