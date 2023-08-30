package exceptions;

import java.util.Scanner;

public class ExceptionMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] number = { 1, 2, 3 };

		// System.out.println(number[4]);

		try {
			for (int i = 1; i < number.length;) {
				i = i + 2;
				System.out.println(number[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessed index is out of limit");
		}

		Person p = null;

		System.out.println("Which person you want to perform something");
		String person = sc.next();
		switch (person) {
		case "Teacher":
			p = new Teacher("Sheela", 30, "Jawani");
			break;
		case "Principal":
			p = new Principle("Mathew", 70);
		case "HOD":
			p = new HOD("Munni", 0, "Badnami");
		}
		letDoSomething(p);

		System.out.println("$$$$$$$$$$$$$$$$$$$");

	}

	public static void letDoSomething(Person p) {

		if (p instanceof HOD) {
			((HOD) p).handleDepartment();
		} else if (p instanceof Teacher) {
			((Teacher) p).techSubject();
		} else {
			((Principle) p).allocateTeacher();
		}

	}

}
