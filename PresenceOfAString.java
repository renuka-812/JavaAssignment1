//3. Write a program to check “brown” is present in the string: A brown fox ran away fast
package DevLabs_Assignments;

public class PresenceOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A brown fox ran away fast";
		String checkString="brown";
		if(str.contains(checkString))
		  System.out.println(checkString+" is present in given string");
		else
			System.out.println(checkString+" is not present in given string");

	}

}
