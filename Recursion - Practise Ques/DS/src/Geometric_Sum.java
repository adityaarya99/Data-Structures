/*Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)*/ 

import java.util.*;
import java.text.DecimalFormat;
public class Geometric_Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = solution45.findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
}

class solution45 {

	public static double findGeometricSum(int k){
 if(k == 0){
        return 1;
    }
   
    return findGeometricSum(k-1) + Math.pow(2, -k);

	}
}
