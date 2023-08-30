package exceptionsDemo;

import java.util.Arrays;

public class RegistrationEmail {
	
	String[]registeredEmailList = {"abc@gmail.com", "cde@email.com", "dfgh@yahoomail.com"};
	
	public void validateEmail(String eneteredEmail) throws EmailNotUniqueException {
		if(Arrays.asList(registeredEmailList).contains(eneteredEmail)) {
			throw new EmailNotUniqueException("Email already Registered");
		}else {
			System.out.println("Email is valid");
		}
	}

}
