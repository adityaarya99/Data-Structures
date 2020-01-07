/*Given a linked list and an integer n, append the 
 * last n elements of the LL to front.
Indexing starts from 0. You don't need to print the elements, 
just update the elements and return the head of updated LL.
Assume given n will be smaller than length of LL*/


/*Sample Input 1 :
1 2 3 4 5 -1
3
Sample Output 1 :
3 4 5 1 2
*/
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

public class AppendLastNToFirst {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(AppendNtF.append(input(), s.nextInt()));
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

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.next;
		}
	}

}