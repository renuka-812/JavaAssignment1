//7. Write a program with nested try blocks.
package DevLabs_Assignments;

public class ProgramWithNestedTryBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			  
	            // initializing array
	            int a[] = { 1, 2, 3, 4, 5 };
	  
	            // trying to print element at index 5
	            System.out.println(a[5]);
	  
	            // try-block2 inside another try block
	            try {
	  
	                // performing division by zero
	                int x = a[2] / 0;
	                System.out.println ("Result = " + x);
	            }
	            catch (ArithmeticException e2) {
	                System.out.println("division by zero is not possible");
	            }
	        }
	        catch (ArrayIndexOutOfBoundsException e1) {
	            System.out.println("ArrayIndexOutOfBoundsException");
	            System.out.println("Element at such index does not exists");
	        }

	}

}
