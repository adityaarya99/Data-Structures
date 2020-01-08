
/*Print a given linked list in reverse order. You need to print the tail first and head last. 
You can’t change any pointer in the linked list, just print it in reverse order.*/

import java.util.Scanner;
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {		
		this.data = data;
	}

}
public class Print_Reverse {
	private static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		PR.printReverseRecursive(input());
	}
	

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
}