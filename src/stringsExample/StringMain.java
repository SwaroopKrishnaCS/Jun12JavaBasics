package stringsExample;

public class StringMain {

	public static void main(String[] args) {

		StringEx ex = new StringEx();

		String v1 = ex.first;
		String v2 = ex.second;
		// Comparison using equal method
		boolean isSame = v1.equals(v2);

		System.out.println(isSame);

		// compare but ignore the case
		boolean isSame1 = v1.equalsIgnoreCase(v2);
		System.out.println(isSame1);

		// Contains
		String[] nameArray = ex.names;
		int count = 0;
		for (int i = 0; i < nameArray.length; i++) {
			if (nameArray[i].contains("Kaur")) {
				count++;
			}
		}
		System.out.println("Count : " + count);

		// Contains & replace
		for (int i = 0; i < nameArray.length; i++) {
			if (nameArray[i].contains("Kaur")) {
				nameArray[i] = nameArray[i].replace("Kaur", "Singh");
			}

		}

		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}

		// Value Of

		boolean val = "Manvir Singh parmar".contains("Singh");
		System.out.println(val);
		String name = String.valueOf(val); 
		System.out.println(name);
		
		
		double num=22.5;
		
		String.valueOf(num); 
		
		
		int a=5;
		
		int b=10;
		
		int c=15;
		
		String valA=String.valueOf(a);
		String valB=String.valueOf(b);
		String valC=String.valueOf(c);
		
		
		System.out.println("The varibale a,b,c with values "+valA +" "+valB+" "+valC+ " is "+(a+b+15));

	}
}
