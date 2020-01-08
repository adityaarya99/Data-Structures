
public class ED {
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> StarLord = new LinkedListNode<Integer>(null);
        StarLord = head;
       while(StarLord.next!=null){
        if(StarLord.data.equals(StarLord.next.data))
        {
            StarLord.next = StarLord.next.next;
        }
        else
        {
            StarLord = StarLord.next;
        }
       }
        return head;
    }
}