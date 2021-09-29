//4. Convert keys of a map to a list. 

package DevLabs_Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConvertKeysOfAMapToList {

	public static void main(String[] args) {
		 Map<Integer, String> myMap = new HashMap<Integer, String>();
	      myMap.put(1, "Java");
	      myMap.put(2, "Python");
	      myMap.put(3, "dotnet");
	      myMap.put(4, "Selenium");
	      ArrayList<Integer> keyList = new ArrayList<Integer>(myMap.keySet());

	      System.out.println("contents of the list holding keys the map ::"+keyList);
	   }

}
