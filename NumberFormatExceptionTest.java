//5. Write a program to throw NumberFormatException and handle it appropriately with a proper message.
package DevLabs_Assignments;

public class NumberFormatExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String input="123.33";
			  int a = Integer.parseInt(input); 
		} catch (NumberFormatException e) {
			 System.err.println("Invalid string in argument");  
		}

	}

}
