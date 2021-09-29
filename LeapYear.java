/*4. Write a program to check whether the current year is leap year or not. Users will 
enter a year value.
*/

package DevLabs_Assignments;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter year - ");
		int a = sc.nextInt();
		if(a%4==0)
		{
			System.out.println(+a +" is leap year");
		}
		else {
			System.out.println(+a +" is not a leap year");
		}
	}

}
