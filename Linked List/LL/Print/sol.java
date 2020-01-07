
public class sol {

	public static void printIth(LinkedListNodeP<Integer> head, int i){
    LinkedListNodeP<Integer> temp = head;
        int count = 0;
        while(temp != null)
        {
            if(count == i)
            {
                System.out.print(temp.data);
                break;
            }
            count++;
            temp = temp.next;
        }
    }
}