package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		// Arthimatic Exception

		try {
			int a = 5;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Division didn't take place");
		}

		// Number Format exception

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		try {
			String num = sc.next();
			int modNum = Integer.valueOf(num);

			System.out.println(modNum / 10);
		} catch (NumberFormatException e) {
			System.out.println("Number input was not correct");
		}
		// File Not Found exception

		try {
			FileInputStream fi = new FileInputStream("C:\\munni\\Owner\\Desktop\\Eclipse\\eclipse");
		} catch (FileNotFoundException e) {

			// e.printStackTrace();
			System.out.println("File path doesn't exist, Plz check");
		}

		System.out.println("Line executed after exception");

	}

}
