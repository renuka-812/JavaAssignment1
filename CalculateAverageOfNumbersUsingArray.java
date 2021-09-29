/*
 * 1. Java Program to Calculate average of numbers using Array 
Example: 
values [] = 1, 2,3 4, 5 
average = 3
 */
package DevLabs_Assignments;

public class CalculateAverageOfNumbersUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values [] = { 1,2,3,4,5 };
		int sum=0;
		for(int i=0;i<(values.length);i++)
		{
			sum=sum+values[i];
		}
		
		System.out.println("Average of numbers: "+sum/values.length);

	}

}
