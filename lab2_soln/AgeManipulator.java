/**
 * Q2. WAP in Java to define variables to store your name, current 
 * age, previous age and next age. Perform following operations:
 *   a) To set your name and current age.
 *   b) Then calculate and set your next age as the current age 
 *      plus last digit of the current age.
 *   c) Then calculate and set your previous age as current age   
 *      minus the first digit of the current age.
 *   d) To show your name along with current, previous and next 
 *      age.
 *
 * @author: Gamachu (2175052)
 * @date: Jul 28, 2023 (Fri)
 * @lab2: KIIT, Campus 1 (sca)
 * @instructor: Mr. Abinash Tripathy
 */
 import java.util.Scanner;
 
 class AgeManipulator {
 	public static void main(String args[]) {
 		String name;
 		int age;
 		int nextAge;
 		int prevAge;

		Scanner s = new Scanner(System.in);
 		System.out.println("Enter your name: ");
 		name = s.nextLine();
 		
 		System.out.println("Enter your current age: ");
 		age = s.nextInt();
 		
 		// set next age as current age + the last digit of current age
 		nextAge = age + (age % 10);
 		
 		// set previous age as current age - first digit of current age
 		prevAge = age - (age / 10);

		System.out.println("Your name is " + name);
		System.out.print("And your current age is " + age);
		System.out.print("\nYour previous age was " + prevAge);
		System.out.println("\nMy next age will be " + nextAge);
	}
}
 		
 		
 		
 
