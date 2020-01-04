/*Write a recursive function to convert a given 
string into the number it represents. That is input will be 
a numeric string that contains only numbers, 
you need to convert the string into corresponding integer and return the answer.*/
import java.util.*;
public class StringToInt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(S2I.convertStringToInt(input));
	}
}
 class S2I {

	public static int convertStringToInt(String input){
	 // If the number represented as a string 
        // contains only a single digit 
        // then returns its value 
        if (input.length() == 1) 
            return (input.charAt(0) - '0'); 
  
        // Recursive call for the sub-string 
        // starting at the second character 
        double y = convertStringToInt(input.substring(1)); 
  
        // First digit of the number 
        double x = input.charAt(0) - '0'; 
  
        // First digit multiplied by the 
        // appropriate power of 10 and then 
        // add the recursive result 
        // For example, xy = ((x * 10) + y) 
        x = x * Math.pow(10, input.length() - 1) + y; 
        return (int)(x); 
	}
}


