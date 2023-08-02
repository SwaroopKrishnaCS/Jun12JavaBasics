package terenaryOperator;

public class TerenaryMain {

	public static void main(String[] args) {

		
		var num1 = 30;
		var num2 = 60;
		var result=0;
		
		/*
		 * if(num1>num2) { result=num1+num2;
		 * 
		 * }else { result=num2-num1; }
		 */
		
		
		result=num1>num2
				?num1+num2
				:num1==num2
				?num1*num2
						:num2/num1;
		
		System.out.println(result);
		
		
		
		
	}

}
