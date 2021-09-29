package DevLabs_Assignments;

import java.util.Enumeration;
import java.util.Hashtable;

public class GetSetViewOfkeysFromHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		hashTable.put("1", "java");
		hashTable.put("2", "selenium");
		hashTable.put("3", "python");
	      Enumeration<String> e = hashTable.keys();
	      while (e.hasMoreElements()) {
	         System.out.println(e.nextElement());
	}
	}
}
