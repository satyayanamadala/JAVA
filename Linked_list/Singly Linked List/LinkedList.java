class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{

    Node head = null;

    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;

            while(current.next != null){
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void InsertAtStart(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void InsertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }

    public void Delete(int data){

        if(head == null){
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;

        while(current.next != null &&
              current.next.data != data){
            current = current.next;
        }

        if(current.next != null){
            current.next = current.next.next;
        }
    }

    public void InsertInMiddle(int target, int data){

        Node current = head;

        while(current != null &&
              current.data != target){
            current = current.next;
        }

        if(current != null){

            Node newNode = new Node(data);

            newNode.next = current.next;
            current.next = newNode;
        }

        else{
            System.out.println(
             "Target node not found"
            );
        }
    }

    public void printList(){

        Node current = head;

        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}