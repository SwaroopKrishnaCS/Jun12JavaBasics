package constructorExample;

import java.util.Scanner;

import constructorExample.Book;

public class BookMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		Book harryPotter = new Book("JK_Rowling", "Goblet_of_fire", false);
		Book famousFive = new Book("Andy_Blyton", "On_an_Island", false);
		Book fivePointSomeone = new Book("Chetan_Bhagat", "Five_Point_Someone", false);
		Book iceAndFire = new Book("R_Martin", "Ice_and_Fire", false);
		Book lordOfTheRings = new Book("JR", "Lord_of_the_Rings", false);
		Book[] namesOfTheBook = { harryPotter, famousFive, fivePointSomeone, iceAndFire, lordOfTheRings };

		do {
			System.out.println("Enter the name of the book that you want to be issued");
			String bookName = sc.next();

			for (int i = 0; i < namesOfTheBook.length; i++) {
				if (namesOfTheBook[i].bookName.equals(bookName) && namesOfTheBook[i].isBookIssued == false) {
					namesOfTheBook[i].isBookIssued = true;
					break;
				}

			}
		} while (cnt < 2);
	}

}
