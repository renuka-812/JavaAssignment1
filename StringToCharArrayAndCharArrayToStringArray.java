//4. Write a program to convert String to a character array and character array to String.
package DevLabs_Assignments;

public class StringToCharArrayAndCharArrayToStringArray {

	public static void main(String[] args) {
		
	String str="String To Character Array";
	//String to a character Array
	char[] charArray = str.toCharArray();
	for (char c : charArray) {
        System.out.println(c);
	}
	String str1=new String(charArray);
	System.out.println(str1);
}
}
