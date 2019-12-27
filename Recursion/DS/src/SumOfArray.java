/*Given an array of length N, 
you need to find and 
return the sum of all elements of the array.*/
import java.util.Scanner;
public class SumOfArray {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(SOA.sum(input));
	}


static class SOA{
	static int n = 0;
	public static int sum(int input[]) {
		if(input.length==0) {
			return 0;
		}
		 	for(int i=0;i<input.length;i++) {
		 		n += sum(input[i]);
		 	}
		 	return n;
	}
}
}