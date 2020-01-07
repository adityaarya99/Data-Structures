
/*Given a linked list and a position i, print the node at ith position.
If position i is greater than length of LL, then don't print anything.
*/

import java.util.Scanner;

class LinkedListNodeP<T> {
	T data;
	LinkedListNodeP<T> next;
	
	public LinkedListNodeP(T data) {
		this.data = data;
	}
}

public class PrintNode {
	
	static Scanner s = new Scanner(System.in);
	
	public static LinkedListNodeP<Integer> takeInput() {
		LinkedListNodeP<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNodeP<Integer> newNode = new LinkedListNodeP<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(LinkedListNodeP<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedListNodeP<Integer> head = takeInput();
		int pos = s.nextInt();
		sol.printIth(head, pos);
	}
}