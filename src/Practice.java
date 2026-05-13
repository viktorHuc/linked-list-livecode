public class Practice {
    public static void main(String[] args) {
        ListNode myNode = new ListNode();
        myNode.data = 'x';
        
        ListNode aNode = new ListNode();
        aNode.data = 't';

        ListNode moreNode = new ListNode();
        moreNode.data = 'r';

        ListNode coolNode = new ListNode();
        coolNode.data = 'w';

        ListNode extra = moreNode;
        moreNode.data = 'e';

        ListNode hello = new ListNode();
        hello.data = 'x';

        //make sure everything is pointed before print it;
        extra.next = hello;
        myNode.next = aNode;
        aNode.next = moreNode;
        coolNode.next = myNode;
        //moreNode.next = coolNode;

        //printList(coolNode);

        ListNode newHead = removeAt(coolNode, 4);
        System.out.println("--------------");
        printList(newHead);
        
;
        System.out.println(countX(coolNode));

    }

    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static int countX(ListNode head){
        ListNode current = head;
        int count = 0;
        while(current != null){
            if(current.data == 'x'){count++;}
            current = current.next;
        }
        return count;
    }

    public static ListNode removeAt(ListNode head, int removeIndex){
        ListNode current = head;
        if(removeIndex == 0){
            return current.next;
        }
        for (int i = 0; i < removeIndex -1; i++){
            current = current.next; 
        }
        current.next = current.next.next;
        return head;
    }
}
