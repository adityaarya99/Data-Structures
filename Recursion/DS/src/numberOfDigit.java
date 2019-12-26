
/*Given the code to find out and return the number 
of digits present in a number recursively.
But it contains few bugs, 
that you need to rectify such
that all the test cases should pass.*/



import java.util.Scanner;
public class numberOfDigit {
	public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			System.out.print(SolutionNOD.count(n));
		}
		
	}
class SolutionNOD{
	public static int count(int n) {
		int smallAns = 0 ;
		int ans = 0;
		if(n==0)
		{
			return 0;
		}
		smallAns = count(n/10);
		ans = smallAns + 1;
		return ans;
	}
}
