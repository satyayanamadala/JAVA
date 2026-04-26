class Main{

public static void main(String args[]){

    DoublyLinkedList dll= new DoublyLinkedList();

    System.out.print("null <=> ");

    dll.add(5);
    dll.add(10);
    dll.add(15);

    dll.InsertAtStart(1);

    dll.InsertAtEnd(20);

    dll.InsertBetween(5,6);

    dll.Delete(20);

    dll.printlist();

    System.out.print("null");
}
}