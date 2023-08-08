/**
 * Q4. Declare two integer variables then apply +, -, *, /, % operations.
 * Also declare suitable variable to store the result.
 * 
 * @author: Gamachu (2175052)
 * @date: Jul 25, 2023 (Tue)
 * @lab1: KIIT, Campus 1 (sca)
 * @instructor: Mr. Abinash Tripathy 
 */

 class ArithmeticOperations {
 	public static void main(String [] args) {
 		int firstInt = 80;
 		int secondInt = 6;
 		
 		// Addition operator
 		int sum = firstInt + secondInt;
 		// Subraction operator
 		int difference = firstInt - secondInt;
 		// Multiplication operator
 		int product = firstInt * secondInt;
 		// Division operator
 		int quotient = firstInt / secondInt;
 		// Modulus operator
 		int remainder = firstInt % secondInt;
 		
 		System.out.printf("For firstInt = %d and secondInt = %d\n", firstInt, secondInt);   // yeah! we can also use printf in java :-)
 		System.out.println("Sum: " + sum);
 		System.out.println("Difference: " + difference);
 		System.out.println("Product: " + product);
 		System.out.println("Quotient: " + quotient);
 		System.out.println("Remainder: " + remainder);
 	}
 }
 		
