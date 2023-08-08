/**
 * Q1.
 * a) Convert the temperature readings given in degree Fahrenheit  
 *    to degree Celsius, using the given formula :
 *              C = (5/9) * (F - 32)
 *    Test these values in degree Fahrenheit using CMD: 68, 150, 
 *    212, 0, -22, -200.
 * b) Convert the obtained Celsius values into Fahrenheit values 
 *    using proper formula.
 *
 * @author: Gamachu (2175052)
 * @date: Aug 01, 2023 (Tue)
 * @lab3: KIIT, Campus 1 (SCA)
 * @instructor: Mr. Abinash Tripathy 
 */
 
 class ConvertTemp {
 	public static void main(String[] args) {
 		float celsius, fahrenheit;
 		
 		// read temp(in F) passed in command line and convert it into float type
 		fahrenheit = Float.parseFloat(args[0]);
 		// convert temp in F into degree C
 		celsius = (float)5/9 * (fahrenheit - 32);
 		System.out.println("The equivalent temperature in celsius is " + celsius);
 		
 		// convert the calculated temp in C back to F
 		fahrenheit = 9f/5f * celsius + 32;
 		System.out.println("The temperature you entered in F was " + fahrenheit);
 	}
 	
 	// static block to notify users to give input values when running the code
 	static {
 		System.out.println("Temperature in F should be given as input on CMD.\n(Try these values: 68, 150, 212, 0, -22, -200 one by one!)");
 	}
 }
 		
 		
