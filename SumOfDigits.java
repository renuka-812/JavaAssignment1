/*
 * 4. Find the sum of digits 
Example: 
int n = 1234; 
output: 10 
 */
package DevLabs_Assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234,i=1,quo=0;
		int rem=0,sum=0;
		while(n>0)
		{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
		}
		System.out.println(sum);
	}
	

}
