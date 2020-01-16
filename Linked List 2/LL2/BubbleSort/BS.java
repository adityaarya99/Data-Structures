
public class BS {

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
		//Write your code here
        for(LinkedListNode<Integer> i=head;i!=null;i=i.next)
        {
         for(LinkedListNode<Integer> j=head;j!=null;j=j.next)
        {
            if(i.data<j.data)
            {
                int temp=i.data;
                i.data=j.data;
                j.data=temp;
            }
        }   
        }
        return head;
	}



}

