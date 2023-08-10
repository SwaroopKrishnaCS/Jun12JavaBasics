package inheritanceTwo;

public class MacDonaldMain {

	
	
	public static void main(String[] args) {
		MacDonaldIndia india=new MacDonaldIndia();
		MacDonaldJapan japan=new MacDonaldJapan();
		
		india.provideBurgers();
		
		india.provideFries();
		
		japan.provideFries();
	}
	
}
