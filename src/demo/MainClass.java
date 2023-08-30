package demo;

public class MainClass {

	
	public static void main(String[] args) {
		WageCalculation cal=new WageCalculation();
		Person manvir=new Person(35, "Manvir", 50);
		Person surya=new Person(30, "Surya", 30);
		Person abishek=new Person(30, "Abishek", 20);
		
		
		
		Person[] persons= {manvir,surya,abishek};
		for (Person person : persons) {
			cal.calculateWage(person);
		}
		
		
	}
}
