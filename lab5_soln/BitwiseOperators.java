/**
 * Q2. WAP in java to explain the use of (&, |, ^, ~) bitwise operators 
 * in java. Define two numbers num1 and num2. Then store the result in
 * num3 after using the operators given above. Print the value of num1,
 * num2, and num3 to check the result.
 *
 * @author: Gamachu (2175052)
 * @date: Aug 08 2023
 * @lab5: KIIT, Campus 1 (sca)
 * @Instructor: Mr. Abinash
 */
 
 class BitwiseOperators {
 	public static void main(String args[]) {
 		int num1, num2, num3;
 		
 		num1 = 4;
 		num2 = 6;
 		num3 = num1 & num2; // bitwise and operator
 		// 00000000 00000110 = 6
 		// 00000000 00000100 = 4
 		// ______________________ Apply & for each bit
 		// 00000000 00000100 = 4
 		System.out.println("6 & 4 = " + num3);
 		
 		
 		num3 = num1 | num2; // bitwise or operator
 		// 00000000 00000110 = 6
 		// 00000000 00000100 = 4
 		// ______________________ Apply | for each bit
 		// 00000000 00000110 = 4
 		System.out.println("6 | 4 = " + num3);
 		
 		num3 = num1 ^ num2; // bitwise xor operator
 		// 00000000 00000110 = 6
 		// 00000000 00000100 = 4
 		// ______________________ Apply ^ for each bit
 		// 00000000 00000010 = 2
 		System.out.println("6 ^ 4 = " + num3);
 		
 		num3 = ~ num1;     // bitwise negation operator
 		// 00000000 00000100 = 4
 		// _______________________ Invert each bits for ~
 		// 11111111 11111011 = -5
 		System.out.println("~ 4 = " + num3);
 		
 		System.out.println("~ 6 = " + (~ 6));
 		System.out.println("~ 0 = " + (~ 0));
 		System.out.println("~ -6 = " + (~ -6));
 		System.out.println("The trick for ~ is: ~ n = -(n + 1)");
 	}
 }
 
