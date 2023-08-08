/**
 * Q3. Define two numbers and swap them without using third variable.
 * a) Use the bitwise ^ operator and show the numbers after swapping.
 * b) Restore the numbers by using (+, 1) operator and show the numbers.
 *
 * @author: Gamachu (2175052)
 * @date: Aug 08 2023
 * @lab5: KIIT, campus 1(sca)
 * @instructor: Mr. Abinash
 */
 
 class SwapNumbers {
 	public static void main(String[] args) {
 		int n1 = 3, n2 = 4;
 		
 		// swap n1 and n2 without using third variable and using ^ operator
 		System.out.println("Before swapping: \nn1 = " + n1 + "\nn2 = " + n2);
 		n1 = n1 ^ n2;
 		n2 = n1 ^ n2;
 		n1 = n1 ^ n2;
 		System.out.println("After swapping: \nn1 = " + n1 + "\nn2 = " + n2);
 		
 		// swap them using a third temporary variable temp
 		int temp = n1;
 		n1 = n2;
 		n2 = temp;
 		System.out.println("Yet after another swapping: \nn1 = " + n1 + "\nn2 = " + n2);
 		
 		// you can swap them like this too on one line
 		n1 = (n1 + n2) - (n2 = n1);
 		System.out.println("Yet after another swapping: \nn1 = " + n1 + "\nn2 = " + n2);
 		
 		// and even one more like this too
 		n1 = (n1 * n2) / (n2 = n1);
 		System.out.println("Yet after another swapping: \nn1 = " + n1 + "\nn2 = " + n2);
 	}
 }
 		
 		
