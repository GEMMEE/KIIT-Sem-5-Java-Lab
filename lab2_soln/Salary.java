/**
 * Q1. The basic salary of an employee is 12000. WAP in JAVA to compute Gross and net
 * salary of that employee where HRA=15%, and DA=110%, PF=12%.
 * Note: Calculation of Gross Salary:
 * Gross Salary = Basic Salary + HRA + DA + Other Allowances (if applicable)
 *
 * Calculation of Net Salary:
 * Net Salary = Gross Salary - (Employee's contribution to PF +   Income Tax and other deductions, if applicable)
 *
 * @author: Gamachu (2175052)
 * @date: Jul 28, 2023 (Fri) 
 * @lab2: KIIT, Campus 1 (SCA)
 * @instructor: Mr. Abinash Tripathy
 */
 
 class Salary {
 	public static void main(String [] callMeWhatever) {
 		int basicSalary = 12000;
 		final double HRA = 0.15 * basicSalary; // HRA stands for House Rent Allowance and final keyword is used for constants
 		double DA = 1.10 * basicSalary; // DA stands for Dearness Allowance
 		final double PF = 0.12 * basicSalary; // PV stands for Provident Fund
 		
 		double grossSalary, netSalary;
 		grossSalary = basicSalary + HRA + DA;
 		netSalary = grossSalary - PF;
 		
 		System.out.println("Gross Salary = " + grossSalary);
 		System.out.println("Net Salary = " + netSalary);
 	}
 }
 		
