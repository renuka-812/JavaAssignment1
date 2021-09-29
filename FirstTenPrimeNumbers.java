//5. Write a program to print the first 10 prime numbers. 

package DevLabs_Assignments;


public class FirstTenPrimeNumbers {

	public static void main(String[] args) {
		int a = 0,j=1, ct=0,i=1;
		
		while(a<=10)
		{	
			j=1;
			ct=0;
			while(j<=i)
			{
				if(i%j==0)  
					ct++;  
					j++; 
			}
			if(ct==2)  
			{  
			System.out.printf("%d ",i);  
			a++;
			}  
			i++;  

		}
	}

}
