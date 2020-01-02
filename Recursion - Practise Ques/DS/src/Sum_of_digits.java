/*Write a recursive function that returns the sum of 
the digits of a given integer.*/
import java.util.*;
public class Sum_of_digits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(solution02.sumOfDigits(n));
	}
}

 class solution02 {

	public static int sumOfDigits(int input){
	if (input == 0) 
            return 0; 
        return (input % 10 + sumOfDigits(input / 10)); 
	}
}
