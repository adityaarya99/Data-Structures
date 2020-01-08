
public class PR {
	public static void printReverseRecursive(LinkedListNode<Integer> root) {
        if(root == null)
        {
            return;
        }
        printReverseRecursive(root.next);
        System.out.print(root.data + " ");
    }
}
