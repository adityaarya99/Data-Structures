public class MSS {
    
    public static LinkedListNode<Integer> sortedMerge(LinkedListNode<Integer> a, LinkedListNode<Integer> b)  
    { 
        LinkedListNode<Integer> result = null; 
       
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  
       
        if (a.data <= b.data)  
        { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        }  
        else 
        { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
  
    } 
  
    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> h)  
    { 
        // Base case : if head is null 
        if (h == null || h.next == null) 
        { 
            return h; 
        } 
  
        // get the middle of the list 
        LinkedListNode<Integer> middle = getMiddle(h); 
        LinkedListNode<Integer> nextofmiddle = middle.next; 
  
        // set the next of middle LinkedListNode<Integer> to null 
        middle.next = null; 
  
        // Apply mergeSort on left list 
        LinkedListNode<Integer> left = mergeSort(h); 
  
        // Apply mergeSort on right list 
        LinkedListNode<Integer> right = mergeSort(nextofmiddle); 
  
        // Merge the left and right lists 
        LinkedListNode<Integer> sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    } 
  
    // Utility function to get the middle of the linked list 
    public static LinkedListNode<Integer> getMiddle(LinkedListNode<Integer> h)  
    { 
        //Base case 
        if (h == null) 
            return h; 
        LinkedListNode<Integer> fastptr = h.next; 
        LinkedListNode<Integer> slowptr = h; 
          
        // Move fastptr by two and slow ptr by one 
        // Finally slowptr will point to middle LinkedListNode<Integer> 
        while (fastptr != null) 
        { 
            fastptr = fastptr.next; 
            if(fastptr!=null) 
            { 
                slowptr = slowptr.next; 
                fastptr=fastptr.next; 
            } 
        } 
        return slowptr; 
    } 
}
