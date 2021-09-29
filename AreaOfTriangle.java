/*
 * 6. Write a program to calculate the area of a triangle. Users will enter the values for 
base and height of the triangle. 
*/

package DevLabs_Assignments;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter base - ");
		int b = sc.nextInt();

		System.out.print("Enter height - ");
		int h = sc.nextInt();
		area=(b*h)/2;
		
		System.out.print("Area of a triangle: "+area);
	

	}

}
