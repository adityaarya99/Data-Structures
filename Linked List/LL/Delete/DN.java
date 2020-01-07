public class DN {

	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i)
    {
	
       int count = 0;
        LinkedListNode<Integer> temp = head;
        if(i == 0)
        {
            temp = temp.next;
        }
        while(count != i-1)
        {
            temp = temp.next;
            count++;
        }
        if(temp == null || temp.next == null)
            return head;
        temp.next = temp.next.next;
        return head;
	}
}



