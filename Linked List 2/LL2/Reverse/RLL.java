
public class RLL {
	
		
		public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
			LinkedListNode<Integer> prev = null;
	        LinkedListNode<Integer> next = null;
	        while(head != null)
	        {
	            next = head.next;
	            head.next = prev;
	            prev = head;
	            head = next;
	        }   
	        head = prev;
	        return head;
		}
	}