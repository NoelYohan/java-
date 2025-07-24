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
    public void delete()
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
        Node curr1=head;
        while(curr1.next!=null)
        {
            Node curr2=curr1;
            while(curr2.next!=null)
            {
                if(curr2.next.data==curr1.data)
                {
                    curr2.next=curr2.next.next;
                }
                else
                {
                    curr2=curr2.next;
                }
            }
            curr1=curr1.next;
        }




    }

    public static void main(String[] args) {
        sam S = new sam();
        S.addFirst(4);
        S.addFirst(2);
        S.addFirst(2);
        S.addFirst(1);
        S.printList();
        S.delete();
        S.printList();
    }
}
