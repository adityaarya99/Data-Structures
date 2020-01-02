/*Given two integers m & n, calculate and return their 
multiplication using recursion. You can only use subtraction 
and addition for your calculation. No other operators are allowed.*/
import java.util.*;
public class Multiplication {
	
	public static void main(String[] args) {
		Scanner scqq = new Scanner(System.in);
		int m = scqq.nextInt();
		int n = scqq.nextInt();
		System.out.println(Multi.multiplyTwoIntegers(m, n));
	}
}

 class Multi {

	public static int multiplyTwoIntegers(int m, int n){
		if (m < n) 
            return multiplyTwoIntegers(n, m);
        else if (n != 0)
        { 
      return (m + multiplyTwoIntegers(m, n - 1));
        }
        else
            return 0;
        }
}

