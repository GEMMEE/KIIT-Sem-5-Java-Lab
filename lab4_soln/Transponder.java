/**
 * 1. A transponder send signal at a speed of 3 bits / sec. Write a 
 * program in java to enter the quantity of data in GB. Then  
 * calculate the time taken by the transponder to send whole data 
 * in hour, minutes and seconds.
 *
 * @author: Gamachu (2175052)
 * @date: Aug 04 2023
 * @lab3: KIIT, Campus 1(SCA)
 * @instructor: Mr. Abinash Tripathy
 */
 
 class Transponder {
 	public static void main(String[] args) {
 		final int SPEED_IN_BITS_PER_SECOND = 3;
 		double dataToBeSentInGB, dataToBeSentInBits;
 		int totalTimeInSec, timeInHr, timeLeftOverInSec, timeInMin, timeInSec;
 		
 		System.out.println("Enter the quantity you want to send in GB: ");
 		java.util.Scanner scan = new java.util.Scanner(System.in);
 		dataToBeSentInGB = scan.nextDouble();
 		
 		dataToBeSentInBits = dataToBeSentInGB * 1024 * 1024 * 1024 * 8;  // 1024MB in 1GB, 1024KB in 1MB, 1024Bytes in 1KB and * bits in 1 byte
 		totalTimeInSec = (int)dataToBeSentInBits / SPEED_IN_BITS_PER_SECOND;
 		timeInHr = totalTimeInSec / 3600;
 		timeLeftOverInSec = totalTimeInSec % 3600;
 		timeInMin = timeLeftOverInSec / 60;
 		timeInSec = timeLeftOverInSec % 60;
 		
 		// System.out.println("Total time taken in seconds: " + totalTimeInSec);
 		System.out.println("Time taken by the transponder to send the whole data is: ");
 		System.out.println(timeInHr + " hr " + timeInMin + " min " + timeInSec + " sec ");
 	}
 }
