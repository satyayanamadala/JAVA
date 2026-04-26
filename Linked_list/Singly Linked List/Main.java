public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(5);
        list.add(10);
        list.add(12);
        list.add(15);

        list.InsertAtStart(1);

        list.InsertAtEnd(20);

        list.Delete(20);

        list.InsertInMiddle(10,11);

        list.printList();
    }
}
