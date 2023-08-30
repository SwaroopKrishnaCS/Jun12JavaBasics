package collectionsExample;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Munni");
		names.add("Sheela");
		names.add("Jalebi");

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("***************************");

		names.remove(1);

		for (String name : names) {
			System.out.println(name);
		}

		String[] girlsGang = { "Aman", "Rajdeep", "Sandeep", "Amrinder" };

		System.out.println(girlsGang[2]);

		System.out.println(names.get(1));

		ArrayList<String> badBoys = new ArrayList<>();
		badBoys.add("Swaroop");
		badBoys.add("Abhishek");
		badBoys.add("Surya");
		
		System.out.println(badBoys.get(1));
		
		System.out.println("Girls in the GANG " + girlsGang.length);
		System.out.println("Bad Boys are " + badBoys.size());
	}

}
