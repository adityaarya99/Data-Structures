/*Given a string, compute recursively a new 
string where all 'x' chars have been removed.*/

import java.util.*;
public class Replace_X {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Rx.removeX(input));
	}
}
 class Rx {

	// Return the changed string
	public static String removeX(String input){
        if(input.length()==1)
        {
            if(input.charAt(0)!='x')
            {
                return input.substring(0,1);
            }
            else
            {
                return "";
            }
        }
        if(input.charAt(0)=='x')
        {
            return removeX(input.substring(1,input.length()));
        }
        return input.charAt(0)+ removeX(input.substring(1,input.length()));
	}
}

