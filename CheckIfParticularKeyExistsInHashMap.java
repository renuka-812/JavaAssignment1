//3. Check if a particular key exists in HashMap.
package DevLabs_Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckIfParticularKeyExistsInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> map = new HashMap<Integer, String>();
     map.put(1, "Java");
     map.put(2, "Python");
     map.put(3, "Selenium");
     int keyToBeChecked = 5;
     System.out.println("HashMap: "+ map);
		Iterator<Map.Entry<Integer, String> >
		iterator = map.entrySet().iterator();
		boolean isKeyPresent = false;
		while (iterator.hasNext()) {
		Map.Entry<Integer, String> entry = iterator.next();
		if (keyToBeChecked == entry.getKey()) {
		
		  isKeyPresent = true;
		}
		}
		System.out.println("Does key "+ keyToBeChecked+ " exists: "+ isKeyPresent);
	}

}
