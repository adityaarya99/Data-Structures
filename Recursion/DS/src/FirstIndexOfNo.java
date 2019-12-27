/*Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.*/

/*
 Sample Input :
	4
	9 8 10 8
	8
Sample Output :
	1
*/


import java.util.*;
public class FirstIndexOfNo {
	public class Runner {
		
		static Scanner s = new Scanner(System.in);
		
		public static int[] takeInput(){
			int size = s.nextInt();
			int[] input = new int[size];
			for(int i = 0; i < size; i++){
				input[i] = s.nextInt();
			}
			return input;
		}
		
		public static void main(String[] args) {
			int[] input = takeInput();
			int x = s.nextInt();
			System.out.println(FIOA.firstIndex(input, x));
		}
	}
	
	 class FIOA {

		public static int firstIndex(int input[], int x) {
	int a =0;
	        for(int i=0;i<input.length;i++)
	    {
	        if(input[i] == x )
	        {
	         a = i; 
	            break;
	        }
	            else {
	                a = -1;
	                
	            }
	    }
	return a;
	    }
		
	}