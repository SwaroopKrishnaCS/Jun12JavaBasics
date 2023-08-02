package advanceForLoop;

public class AdvanceForLoop {

	public static void main(String[] args) {

		/*
		 * String[] names = { "Manvir", "Manpreet", "Blessey", "Geethu" };
		 * 
		 * 
		 * for (int i = 0; i < names.length; i++) { System.out.println(names[i]); }
		 * 
		 * for (String name : names) { System.out.println(name); }
		 */
		
		int[] rollNumbers= {1,2,3,4,5,6,7,8,9};
		
		
		for (int i = 0; i < rollNumbers.length;) {
			i=i+2;
			System.out.println(rollNumbers[i]);
			if(i>rollNumbers.length) {
				break;
			}
		}
		/*
		 * for (int rollNo : rollNumbers) { System.out.println(rollNo); }
		 */
		

	}

}
