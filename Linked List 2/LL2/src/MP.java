public class MP {
	public static int printMiddel(LinkedListNode<Integer> head) {
      LinkedListNode<Integer> slow = head;
      LinkedListNode<Integer> fast = head;
      while( fast.next.next!=null)
      {
             slow = slow.next;
             fast = fast.next.next;
             }
             return slow.data;
    }
}