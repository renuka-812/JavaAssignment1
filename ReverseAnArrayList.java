//2. Reverse an Arraylist. 

package DevLabs_Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ArrayList= new ArrayList<String>();
		ArrayList.add("Java");
		ArrayList.add("Selenium");
		ArrayList.add("Python");
		ArrayList.add("dotnet");
		
		Collections.reverse(ArrayList);
		System.out.println(ArrayList);
	}

}
