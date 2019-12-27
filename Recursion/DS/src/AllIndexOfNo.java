/*Given an array of length N and an integer x, 
you need to find all the indexes where x is present in the input array. 
Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.*/

import java.util.*;
public class AllIndexOfNo {

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
		int output[] = AION.allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}

 class AION {	
    public static int[] allIndexes(int input[], int x, int startIndex) 
    {		
        if(startIndex == input.length) 
        {		
            int output[] = new int[0];
            return output;
        }
        int smallOutput[] = allIndexes(input, x, startIndex + 1);
        if(input[startIndex] == x)
        {		
            int output[] = new int[smallOutput.length + 1];
            output[0] = startIndex;	
            for(int i = 0; i < smallOutput.length; i++)
            {			
                output[i + 1] = smallOutput[i];
            }			
            return output;
        }
        else
        {
            return smallOutput;	
        }
    }
    public static int[] allIndexes(int input[], int x) 
    {		
    return allIndexes(input, x, 0);
    }
    }