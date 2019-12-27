/*Given an array of length N and an integer x,
you need to find if x is present in the array or not. 
Return true or false.*/


/*Sample input
3
9 8 10
8
*/

/*Sample Output
True*/


import java.util.*;
public class CheckNoInArray {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(CNIA.checkNumber(input, x));
	}
}
 class CNIA {
	
	public static boolean checkNumber(int input[], int x) {
	boolean a = false;
for(int i=0;i<input.length;i++)
{
        if(input[i]==x)
    {
        a = true;
            break;
    }
    
}      
        return a;
	}
}
