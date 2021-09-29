/*
 * 10. Write a program to print this output using a two-dimensional array. 
Triangle Array
 */

package DevLabs_Assignments;

public class TwoDimensionalTriangleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k,n=10;
		k=n-1;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=k;j++)
			{
				System.out.print(" ");
			
			}
			k=k-1;
			for(int j=0;j<=i;j++)
				System.out.print("*"+" ");
			System.out.println("\r");
		}
	}

}
