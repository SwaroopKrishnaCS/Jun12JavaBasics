package castingExample;

import demo.Person;

public class CastingMain {

	public static void main(String[] args) {
		Employee employee=new Manager(5, "Munni", "B", "Finance",50);
		
		
		
		
		employee=new Cashier(10, "Sheela", 25,false);
		
		
		
		printWages(employee);
		printWages(employee);
		
	}
	
	
	public static void printWages(Employee employee) {
		double totalWage=8*20*employee.wage;
		System.out.println("Total wage of " +employee.name + " and id " + employee.id + " is " + totalWage);
	} 

}
