//5. Reverse a number 123 
package DevLabs_Assignments;

public class ReverseANumber123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123,rem=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			System.out.print(rem);
		}

	}

}
