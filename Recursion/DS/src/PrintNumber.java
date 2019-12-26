/*Given the code to print number from 1 to n in
increasing order recursively.
But it contains few bugs,
that you need to rectify such that all
the test cases should pass
*/


import java.util.*;
public class PrintNumber {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		solution.print(n);
	}
	
}

 class solution{
	public static void print(int n) {
		if(n==0) {
			return ;
		}
		print(n-1);
		System.out.print(n + " ");
	}
}