public class sam {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data)
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
    public void delete(int d)
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
        if(head.data==d)
        {
            head=head.next;
        }
        int i=0;
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.next.data==d)
            {
                temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }
        }



    }

    public static void main(String[] args) {
        sam S = new sam();
        S.addFirst(4);
        S.addFirst(3);
        S.addFirst(2);
        S.addFirst(1);
        S.printList();
        S.delete(1);
        S.printList();
    }
}
