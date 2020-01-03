/*Given a string, compute recursively a new string 
where all appearances of "pi" have been replaced by "3.14".*/

/*Sample Input 1 :
xpix
Sample Output :
x3.14x*/


import java.util.*;

public class Replace_pi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.replace(input));
	}
}

 class solution {

	// Return the changed string
	public static String replace(String input){
		// Write your code here
String output = ""; 
  
        int size = input.length(); 
  
        // Iterate through second last 
        // element of the String 
        for (int i = 0; i < size; ++i) { 
            // If current and current +1 alphabets 
            // form the word 'pi' 
            // append 3.14 to output 
            if (i + 1 < size && input.charAt(i) == 'p' && input.charAt(i + 1) == 'i') { 
                output += "3.14"; 
                i++; 
            } 
  
            // Append the current letter 
            else { 
                output += input.charAt(i); 
            } 
        } 
  
        // Return the output String 
        return output; 
    
	}
}

