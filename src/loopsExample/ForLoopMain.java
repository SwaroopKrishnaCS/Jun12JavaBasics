package loopsExample;

import java.util.Scanner;

public class ForLoopMain {

	public static void main(String[] args) {
		ForLoopExample forLoop = new ForLoopExample();
		
		forLoop.actualPin = 1234;
		Scanner sc = new Scanner(System.in);
			
		forLoop.validatePin();

	}

}
