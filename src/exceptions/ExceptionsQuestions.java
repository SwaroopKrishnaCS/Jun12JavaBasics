package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsQuestions {

	public static void main(String[] args) {

		// Can a try block exist by itself
//		try {
//			FileInputStream fi = new FileInputStream("C:\\munni\\Owner\\Desktop\\Eclipse\\eclipse");
//		} catch (FileNotFoundException e) {
//			System.out.println("File is not present");
//		}

		// Can a try block catch multiple exceptions

		try {
			DateFormat date = new SimpleDateFormat("MMddyyyy");
			date.parse("2023-08-24");
			String todayDate = date.format(date);
			System.out.println(todayDate);
		} catch (ParseException e) {
			System.out.println("Not a date");
		} catch (IllegalArgumentException e) {
			System.out.println("incorrect date format");
		}

	}

}
