package exceptions;

public class Teacher extends Person {

	String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;

	}

	public void techSubject() {
		System.out.println("Teacher teaching " + subject);
	}

}
