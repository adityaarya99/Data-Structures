/*Given an array of length N and an integer x, you need to find 
 * and return the last index of integer x present in the array. 
 * Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array,
 return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).*/



import java.util.*;
public class LastIndexOfNo {

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
		System.out.println(LION.lastIndex(input, x));
	}
}

 class LION {

	public static int lastIndex(int input[], int x) {
		
	if(input.length==0)
        return -1;
		
        return(lastIndex(input,x,0));
	}
    public static int lastIndex(int input[],int x,int l)
    {
        if(l>=input.length)
        {
             return -1;
        }
        
        int ans=lastIndex(input,x,l+1);
        if(ans==-1)
        {
            if(input[l]==x)
            {
                return l;
            }
            else 
                return -1;
        }
        else
            return ans;
    }
	
}