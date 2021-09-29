
/*
1. Write a program to calculate the factorial of a number using a while loop. 
The factorial of a positive number n is given by: 
factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n

*/

package DevLabs_Assignments;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n number- ");
		int a = sc.nextInt();
		int fact = 1;

		for (int i = 1; i <= a; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}
}
