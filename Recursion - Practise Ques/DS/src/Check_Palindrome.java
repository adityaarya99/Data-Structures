/*Check if a given String S is palindrome or not (using recursion). 
Return true or false.*/

import java.util.*;
public class Check_Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution1.isStringPalindrome(input));
	}
}
 class solution1 {

	public static boolean isStringPalindrome(String input) {
// if length is 0 or 1 then String is palindrome
        if(input.length() == 0 || input.length() == 1)
            return true; 
        if(input.charAt(0) == input.charAt(input.length()-1))
         
            return  isStringPalindrome(input.substring(1, input.length()-1));
 
        return false;
	}
}
