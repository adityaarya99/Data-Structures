public class FN {
    public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
         int len = 0;
        LinkedListNode<Integer> temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            len++;
        }
        int j=0;
        while(j<len)
        {
            if(head.data == n)
            {
                return j;
            }
            head = head.next;
            j++;
        }
        return -1;
        }
}
