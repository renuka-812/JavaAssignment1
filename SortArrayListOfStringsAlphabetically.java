//7. Sort ArrayList of Strings alphabetically. 
package DevLabs_Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListOfStringsAlphabetically {
	
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();   
		arrayList.add("selenium");
		arrayList.add("dotnet");
		arrayList.add("java");
		arrayList.add("python");
		Collections.sort(arrayList);   
		System.out.println(arrayList);
	}

}
