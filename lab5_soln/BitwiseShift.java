/**
 * Q1. Define two numbers v and n, where v is the original operator and 
 * n is the shifting value. Then shift the value of v to left (<<) up to
 * n bits and print the new values. Also use the >>> operator for right s
 * shift and observe the difference between >> and >>>.
 *
 * @author: Gamachu (2175052)
 * @date: Aug 08 2023
 * @lab5: KIIT, campus 1(sca)
 * @instructor: Mr. Abinash
 */
 
 class BitwiseShift {
 	public static void main(String[] args) {
 		int v = 8, n = 3;
 		
 		// left shifting 8 by 3
 		System.out.println("8 << 3 = " + (8 << 3));
 		// right shifting 8 by 3(preserving its sign)
 		System.out.println("8 >> 3 = " + (8 >> 3));
 		// zero fill right shifting 8 by 3(without preserving its sign)
 		System.out.println("8 >>> 3 = " + (8 >>> 3));
 		
 		System.out.println(">> and >>> operators give same values for positive numbers!");
 		
 		v = -8;
		// left shifting -8 by 3
 		System.out.println("-8 << 3 = " + (-8 << 3));
 		// right shifting -8 by 3(preserving its sign)
 		System.out.println("-8 >> 3 = " + (-8 >> 3));
 		// zero fill right shifting -8 by 3(without preserving its sign)
 		System.out.println("-8 >>> 3 = " + (-8 >>> 3));
 		System.out.println(">> and >>> operators give different values for negative numbers!");
 	}
 }
 
