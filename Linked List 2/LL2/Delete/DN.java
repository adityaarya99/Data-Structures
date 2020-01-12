public class DN {

	public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i){
		
		if (i > 0 && head.next == null) {
        return head;
    }

    if (i == 0 || head.next == null) {
        return head.next;
    }

    head.next = deleteIthNodeRec(head.next, i - 1);
    return head;        

		
	}
}
