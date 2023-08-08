/**
 * Q3. Write a program to declare different variables of different data
 * types used in Java and also show the values that you have assigned.
 *
 * @author: Gamachu (2175052)
 * @date: Jul 25 2023 (Tues)
 * @lab1: KIIT, Campus 1 (sca)
 * @instructor: Mr. Abinash Tripathy 
 */
 
 class DataTypes {
 	public static void main(String args[]) {
 		// there are 8 primitive data types in java
 		byte byteVar = 9;  // byte data type
 		short shortVar = 180; // short data type
 		int intVar = 400;    // int data type
 		long longVar = 900;  // long data type
 		float floatVar = 2.3f;   // float data type and note that f is mandatory
 		double doubleVar = 4.99;  // double data type
 		char charVar = 'G';      // char data type
 		boolean boolVar = true;   // boolean data type
 		
 		// examples of non primitive data types
 		String stringVar = "Examples of reference data types in java include: ";   // String data type
 		String[] arrayVar = {"String", "Array", "Objects"};   // Array data type and note that we use parentheses not square brackets
 		
 		System.out.print("The following are the 8 primitive data types in Java: \n");
 		System.out.println("byte: " + byteVar);
 		System.out.println("short: " + shortVar);
 		System.out.println("int: " + intVar);
 		System.out.println("long: " + longVar);
 		System.out.println("float: " + floatVar);
 		System.out.println("double: " + doubleVar);
 		System.out.println("char: " + charVar);
 		System.out.println("boolean: " + boolVar);
 		System.out.println();  // prints one new line
 		System.out.println(stringVar);
 		System.out.println(arrayVar[0] + ", " + arrayVar[1] + ", " + arrayVar[2]);
 	}
 }
