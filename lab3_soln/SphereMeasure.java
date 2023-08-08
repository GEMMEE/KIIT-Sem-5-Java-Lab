/**
 * Q2. Calculate the volume and surface area of a sphere using the 
 * following formula:
 *            V= 4/3 πr3 , A = 4 πr2 , π=3.14159
 * Test the program using CMD for the given radius: 1, 6, 12.2,0.2.
 *
 * @author: Gamachu (2175052)
 * @date: Aug 01 2023 (Tue)
 * @lab3: KIIT, Campus 1 (SCA)
 * @instructor: Mr. Abinash Tripathy 
 */
 
 class SphereMeasure {
 	public static void main(String[] args){
 		final double PI = 3.14159;
 		double radius, volume, area;
 		
 		try {
 			radius = Double.parseDouble(args[0]);
 			area = 4 * PI * radius * radius;
	 		volume = 4.0 / 3 * PI * radius * radius * radius;
	 		
	 		System.out.printf("Area of the sphere = %.2f\n", area);
	 		System.out.printf("Volume of the sphere = %.2f\n", volume);
 		}
 		catch(ArrayIndexOutOfBoundsException e) {
 			System.out.println("Test the program using CMD using these values: 1, 6, 12.2 and 0.2 one at a time");
 		}
 	}
 }
 
