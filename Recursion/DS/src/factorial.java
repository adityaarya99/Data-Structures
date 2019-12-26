/*Factorial of a number using Recursion*/

import java.util.*;
public class factorial {
public static int fact(int n) {
if(n==0 || n==1) {
	return 1;
}
return n * fact(n-1);

}

		public	static void main(String args[])
		{
					int num;
					Scanner	s =	new	Scanner(System.in);
					num	=	s.nextInt();
					System.out.print(fact(num));
					
		
		}
}
