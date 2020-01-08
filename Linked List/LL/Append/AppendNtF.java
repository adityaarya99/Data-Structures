
public class AppendNtF {
    public static int LengthIterative(LinkedListNode<Integer>head){
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
    }
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer>temp1=head;
		LinkedListNode<Integer>temp2=head;
		int length=LengthIterative(head);
		int i=0;
		while(i<length-n-1)
		{
			temp1=temp1.next;
			i++;
		}
		head=temp1.next;
		temp1.next=null;
		LinkedListNode<Integer>tempHead=head;
		while(tempHead.next!=null)
		{
			tempHead=tempHead.next;
		}
		tempHead.next=temp2;
		return head;
	}
}

