package firstPackage;

public class MobileMain {

	public static void main(String[] args) {
		
		//Instantiating a class Or Creating instance of a class
		MobilePhone iPhone = new MobilePhone();
		
		//Assigning values to the variables
		iPhone.brandName = "IPhone";
		iPhone.modelNumber = 12;
		iPhone.screenSizeInInches = 6.1;
		iPhone.isCameraPresent = true;
		
		//Calling the method or Invoking the method
		iPhone.makeCalls();
		iPhone.sendTextMessage();
		iPhone.takePictures();
		
		System.out.println("**********************************");
		//Instantiating a class
		MobilePhone samsung = new MobilePhone();
		samsung.brandName = "Samsung";
		samsung.modelNumber = 22;
		samsung.screenSizeInInches = 6.2;
		samsung.isCameraPresent = true;
		samsung.makeCalls();
		
	}

}
