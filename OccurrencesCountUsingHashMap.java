//1. Find duplicate characters with their occurrences count using HashMap.
package DevLabs_Assignments;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesCountUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "selenium";
		char[] strToCharArray=str.toCharArray();
		HashMap<Character, Integer> charCount=new HashMap<Character, Integer>();
		for(char c:strToCharArray)
		{
			if(charCount.containsKey(c))
				charCount.put(c, charCount.get(c) + 1);
			else
				charCount.put(c,1);
		}
		for(Map.Entry entry : charCount.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
