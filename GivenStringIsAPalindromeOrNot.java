/*
 * 2. Write a program to check if a given string is a palindrome or not. 
 Palindrome example: trurt
 */

package DevLabs_Assignments;


public class GivenStringIsAPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "trurt",strReverse = "";
		int strLen;
		strLen=str.length();
		
		for(int i=strLen-1;i>=0;i--)
		{
			strReverse=strReverse+str.charAt(i);
		}
		
	if(str.equals(strReverse))
		System.out.println(str+" is a palindrome");
	else
		System.out.println(str+" is not a palindrome");
		
	}

}
