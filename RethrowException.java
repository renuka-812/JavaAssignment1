//8. Write a program to re-throw an exception. (throw inside catch block
package DevLabs_Assignments;

public class RethrowException {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		try {
			try 
			{
				System.out.println("The Exception in ");
				throw new Exception("thrown from first try");
			} 
			catch (Exception e) {
				System.out.println("Inside second try");
				throw e;
			}
		  }
		catch (Exception e) {
			System.out.println("Caught Exception");
		}

	}

}
