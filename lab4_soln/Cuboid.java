/**
 * Q2. A cuboid shape tank of length, breadth, and height are l, b, h. 
 * The tank is full of water. The water is measured by a cylindrical  
 * device of radius r and height ht. Find the number of times water 
 * can be measured by the cylinder and the amount of water left.
 *
 * @author: Gamachu (2175052)
 * @date: Aug 04 2023 (Fri)
 * @lab4: KIIT, Campus 1 (SCA)
 * @instructor: Mr. Abinash Tripathy
 */
 import java.util.Scanner;
 
 class Cuboid {
 	public static void main(String [] args) {
 		int l, b, h, v1, r, ht, v2;
 		
 		Scanner scan = new Scanner(System.in);
 		System.out.print("\nEnter the length of the cuboid: ");
 		l = scan.nextInt();
 		System.out.print("\nEnter the breadth of the cuboid: ");
 		b = scan.nextInt();
 		System.out.print("\nEnter the height of the cuboid: ");
 		h = scan.nextInt();
 		
 		// calculate the volume of the cuboid
 		v1 = l * b * h;
 		
 		System.out.print("\nEnter the radius of the measuring device: ");
 		r = scan.nextInt();
 		
 		System.out.print("\nEnter the height of the measuring device: ");
 		ht = scan.nextInt();
 		
 		// calculate the volume of the cylinder(measuring device)
 		v2 = (int)(Math.PI * r * r * ht);
 		
 		// calculate the number of times water can measured
 		int f = v1 / v2;
 		
 		// calculate the amount of water left over
 		int o = v1 % v2;
 		
 		System.out.println("The number of times water can measured is " + f);
 		System.out.println("The amount of water left over in the cuboid is " + o);
 	}
 }
 		
