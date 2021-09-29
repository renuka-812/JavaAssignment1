/*
 * 1. Write a program to print the occurrence of each character in the String 
“DevLabs Alliance Training”
 */
package DevLabs_Assignments;

public class OccurrenceOfEachCharacterInTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="DevLabs Alliance Training";
		int i, length, counter[] = new int[256];
        length = str.length();
        for (i = 0; i < length; i++) {
            counter[(int) str.charAt(i)]++;
        }
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
            }
        }

	}
