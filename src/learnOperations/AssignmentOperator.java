package learnOperations;

public class AssignmentOperator {
	
	int age = 25;
	
	void findAgeAfter5Years() {
//		int finalAge = age+5;
//		System.out.println("Age after 5 years = "+finalAge);
		//age = age+5
		age += 5; //add equal to
		System.out.println("Age after 5 years = "+age);
	}
	
	void findAgeBefore10Years() {
		
		age -=10;
		System.out.println("Age before 10 years = "+age);
	
	}

}
