package stringsExample;

public class StringFormat {

	public static void main(String[] args) {

		StringEx ex = new StringEx();

		String val = ex.text;

		//System.out.println(val + "  to  library");
		
		String formattedText=String.format(val,"Blessy",1236,"Toronto");
		System.out.println(formattedText);

	}

}
