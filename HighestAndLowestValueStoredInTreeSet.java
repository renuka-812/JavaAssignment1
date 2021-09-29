//6. Get highest and lowest value stored in TreeSet 
package DevLabs_Assignments;

import java.util.TreeSet;

public class HighestAndLowestValueStoredInTreeSet {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
	    treeSet.add("java");
	    treeSet.add("selenium");
	    treeSet.add("python");
	    treeSet.add("dotnet");
	    System.out.println("Lowest value in the TreeSet is : "  + treeSet.first());
	    System.out.println("Highest value in the TreeSet is : " + treeSet.last());
	}

}
