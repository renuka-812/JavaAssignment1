/*
 * 2. Write a program to print fibonacci series (10 values). 
A series where the next term is the sum of previous two terms. The first 
two terms of the Fibonacci sequence is 0 followed by 1. 
The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

 */

package DevLabs_Assignments;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number- ");
		int n = sc.nextInt();
		int fib = 0;
		int a=0,b=1;
		System.out.println(fib);
		for (int i = 0; i <= n; i++) {
			a=b;
			b=fib;
			fib=a+b;
			System.out.println(fib);
		}
	}

}
