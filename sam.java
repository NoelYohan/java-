public class sam {
    Node head;
    class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next=null;
        }
    }
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void printList()
    {
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void sort()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }
        if(head.next==null)
        {
            System.out.println("The list is empty");
        }
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;
        Node temp = head;

        while(temp!=null)
        {
            Node nextNode = temp.next;
            if(temp.data==0)
            {
                temp.next=null;
                zeroTail.next=temp;
                zeroTail=zeroTail.next;
            } else if (temp.data==1) {
                temp.next=null;
                oneTail.next=temp;
                oneTail=oneTail.next;
            } else if (temp.data==2) {
                temp.next=null;
                twoTail.next=temp;
                twoTail=twoTail.next;
            }
            temp=nextNode;
        }
        if(oneHead.next==null)
        {
            zeroTail.next=twoHead.next;
        }
        else
        {
            zeroTail.next=oneHead.next;
            oneTail.next=twoHead.next;
        }
        oneHead.next=null;
        twoHead.next=null;
        Node t = zeroHead;
        zeroHead=zeroHead.next;
        t.next=null;




    }

    public static void main(String[] args) {
        sam S = new sam();
        S.addFirst(1);
        S.addFirst(1);
        S.addFirst(2);
        S.addFirst(0);
        S.addFirst(1);
        S.addFirst(2);
        S.addFirst(2);
        S.addFirst(0);
        S.printList();
        S.sort();
        S.printList();
    }
}
