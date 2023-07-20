package constructorExample;

import java.util.Scanner;

public class MainConstructor {

	public static void main(String[] args) {

		BankAccount samAcc = new BankAccount("978465", "Sam", 500);

		BankAccount mariaAcc = new BankAccount("978265", "maria", 1500);

		BankAccount rahulAcc = new BankAccount("978365", "Rahul", 2500);

		BankAccount geethuAcc = new BankAccount("978565", "Geethu", 3500);
		
		
		System.out.println(mariaAcc.balance);
		
		System.out.println(samAcc.balance);
		
		System.out.println(rahulAcc.balance);
		
		System.out.println(geethuAcc.balance);
		
		Scanner sc=new Scanner(System.in);
		String statusOfPerson=sc.next();
		
		
		if(statusOfPerson.equals("Student")||statusOfPerson.equals("WP")) {
			System.out.println("Enter the account");
			String account=sc.next();
			
			System.out.println("Enter the name");
			String name=sc.next();
			
			System.out.println("Enter the balance");
			double balance=sc.nextInt();
			
			System.out.println("Enter the status");
			String status=sc.next();
			BankAccount acc=new BankAccount(account, name, balance, status);
		}else {
			
			System.out.println("Enter the account");
			String account=sc.next();
			
			System.out.println("Enter the name");
			String name=sc.next();
			
			System.out.println("Enter the balance");
			double balance=sc.nextInt();
			BankAccount acc=new BankAccount(account, name, balance);
			
		}
		

	}

}
