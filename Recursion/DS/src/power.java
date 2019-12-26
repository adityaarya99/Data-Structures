/*Write a program to find x to the power n (i.e. x^n).
Take x and n from the user. 
You need to return the answer.
*/

import java.util.Scanner;
 class Solution {

	public static int power(int x, int n) {
	if(n==0)
        {
        return 1;
        }
        if(n==1)
            {
            return x;
            }
        else
            {
        return (x * power(x,n-1));
          }
		
	}
}


public class power {
		static Scanner s = new Scanner(System.in);

		public static void main(String[] args) {
			int x = s.nextInt();
			int n = s.nextInt();
			
			System.out.println(Solution.power(x, n));
	}

}
