/**
 * Q3. WAP in java to find the smaller and greater number among two
 * numbers read from CMD using ternary operator.
 *
 * @author: Gamachu (2175052)
 * @date: Aug 08, 2023
 * @lab3: KIIT, Campus 1 (SCA)
 * @instructor: Mr. Abinash Tripathy
 */
 
 class GreaterNumber {
 	/**
 	 * Takes two CMD arguments and compare them and 
 	 * prints which number is greater and smaller or equal
 	 * @param: two integer arguments should be passed
 	 * @return: none
 	 */
 	public static void main(String[] args) {
 		int arg1 = Integer.parseInt(args[0]);
 		int arg2 = Integer.parseInt(args[1]);
 		String equal = arg1 == arg2 ? "equal" : "not equal";
 		if (equal.equals("equal")) {
	 		System.out.println("The two numbers are equal");
	 	}
 		else {
 			int greater = arg1 > arg2 ? arg1 : arg2;
 			System.out.println("Greater number is " + greater);
 			if (greater == arg1)
		 	System.out.println("Smaller number is " + arg2);
		 	else
		 	System.out.println("Smaller number is " + arg1);
		 }
 		
	 }
}
	 		
