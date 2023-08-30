package exceptionsDemo;

public class RegisterUserMain {

	public static void main(String[] args) {
		RegistrationEmail email = new RegistrationEmail();
		
		try {
			email.validateEmail("abc@gmail.com");
		} catch (EmailNotUniqueException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
