package arrayDemo;

import java.util.Scanner;

public class ArrayIteration {

	int[] numArray = { 1, 2, 3, 4, 5 };

	String[] names = new String[5];
	
	Scanner sc = new Scanner(System.in);
	//Print each element in an array
	void printNumArray() {
		for(int i=0;i<numArray.length;i++) {
			System.out.println("Element at index " + i + " :" + numArray[i]);
		}
	}
	
	void populateNameArray() {
		
		for(int i=0;i<names.length;i++) {
			System.out.println("Enter name: "+(i+1));
			names[i] = sc.next();
		}
	}
	
	void printNames() {
//		System.out.println(names);
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}
	
	//Find the entered name if present in the array
	void findNameInArray() {
		String enteredName;
		System.out.println("Enter the name you want to search");
		enteredName = sc.next();
		for(int i=0;i<names.length;i++) {
			if(enteredName.equals(names[i])) {
				System.out.println("name is present in the array");
			}else {
				System.out.println("Name is not present in the array");
				break;
			}
			
		}
	}

}
