package macdonald;

import java.util.Scanner;

public class MainMacdonald {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Country Name");
		String nameOfCountry = sc.next();
		MacDonald franchise = nameOfCountry.equalsIgnoreCase("India") ? new MacDonaldIndia("India", 1950, 50000, 500, 11)
				: new MacDonaldAustralia("Australia", 1950, 50000, 500, 8);
		
		double totalPrice = franchise.calPriceOfMeal(15, 10, 5);
		System.out.println(totalPrice);

		franchise.conductTraining("Hospitality");

		franchise.description();

		ShiftManager sm = new ShiftManager(101, "Munni", "Inventory control", "General");
		sm.handleShiftMeeting();

		Manager manager = new Manager(201, "Sheela", "StoreKeeping");
		manager.executeManagerTasks();

	}

}
