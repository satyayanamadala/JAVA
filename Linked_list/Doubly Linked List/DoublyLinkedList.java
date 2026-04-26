class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        next=null;
        prev=null;
    }
}

class DoublyLinkedList{

    Node head=null;

    public void add(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }
        else{
            Node current=head;

            while(current.next!=null){
                current=current.next;
            }

            current.next=newNode;
            newNode.prev=current;
        }
    }

    public void InsertAtStart(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }

        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    public void InsertAtEnd(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node current=head;

        while(current.next!=null){
            current=current.next;
        }

        current.next=newNode;
        newNode.prev=current;
    }

    public void Delete(int data){

        if(head==null) return;

        if(head.data==data){
            head=head.next;

            if(head!=null){
                head.prev=null;
            }
            return;
        }

        Node current=head;

        while(current!=null &&
              current.data!=data){
            current=current.next;
        }

        if(current!=null){

            if(current.prev!=null){
                current.prev.next=current.next;
            }

            if(current.next!=null){
                current.next.prev=current.prev;
            }
        }
    }

    public void InsertBetween(int target,int data){

        Node current=head;

        while(current!=null &&
              current.data!=target){
            current=current.next;
        }

        if(current!=null){

            Node newNode=
              new Node(data);

            newNode.next=current.next;
            newNode.prev=current;

            if(current.next!=null){
               current.next.prev=newNode;
            }

            current.next=newNode;
        }
    }

    public void printlist(){

        Node current=head;

        while(current!=null){
            System.out.print(
            current.data+" <=> ");
            current=current.next;
        }
    }
}
