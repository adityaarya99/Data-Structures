/*Given a string, compute recursively a new string 
 * where identical chars that are adjacent in the original
 *  string are separated from each other by a "*".
Sample Input 1 :
hello
Sample Output 1:
hel*lo*/
import java.util.*;
public class Pair_Star {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(PS.addStars(input));
	}
}

 class PS {

	// Return the updated string
	public static String addStars(String s) 
    {
        String s1 = "";
        s1+=s.charAt(0);
        if(s.length()==1)
        {
            return s1;
        }
        if (s.charAt(0)==s.charAt(1))
        {
            return s1+"*"+addStars(s.substring(1,s.length()));
        }    
        return s1+addStars(s.substring(1,s.length()));
	}
}