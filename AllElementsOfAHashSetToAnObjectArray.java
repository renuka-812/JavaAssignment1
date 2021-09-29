//5. Copy all elements of a HashSet to an Object array. 

package DevLabs_Assignments;

import java.util.HashSet;
import java.util.Set;

public class AllElementsOfAHashSetToAnObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> hashset = new HashSet<String>();
		 hashset.add("Selenium");
		 hashset.add("Java");
		 hashset.add("Python");
		 hashset.add("dotNet");
	      System.out.println("Elements in hash set = "+hashset);
	      Object[] obArr = hashset.toArray();
	      for (Object ob : obArr)
	      System.out.println(ob);

	}

}
