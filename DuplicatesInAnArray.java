//6. Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6
package DevLabs_Assignments;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray[]= {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
        for (int i = 0; i < myArray.length; i++) 
        {
            for (int j = 0; j < myArray.length; j++) 
            {
                if (i != j) 
                {
                    if (myArray[i] == myArray[j]) 
                    {
                        System.out.println(myArray[i]); // means there are duplicate values
                    }
                }
            }
        }
        
	}

}
