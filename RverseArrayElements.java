/*
  8. Write a program to reverse the elements of an array where the array size as well as the 
array values are entered by the user. 

 */

package DevLabs_Assignments;

import java.util.Scanner;

public class RverseArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number elements: ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int rev[] = new int[n];
		int j = 0;
		System.out.println("Reverse of an array is :");
		for (int i = n; i > 0; i--, j++) {
			rev[j] = array[i - 1];
			System.out.println(rev[j]);
		}
		
	
	}

}
