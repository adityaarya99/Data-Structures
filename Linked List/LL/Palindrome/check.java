import java.util
import java.util.ArrayList;
public class check {
	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        
        LinkedListNode<Integer> temp=head;
        
        while(temp!=null)
        {
            a.add(0,temp.getData());
            temp=temp.next;
            
        }
        
        
        temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.getData()!=a.get(i))
                return false;
            temp=temp.next;
            i++;
        }
        
        return true;
        
    }
    
        
   
}



