package Collections.LinkedList;

public class MainCircularLinkedList {

  public static void main(String[] args) {
    CircularLinkedList circularLinkedList = new CircularLinkedList();
    circularLinkedList.insertValue(3);
    circularLinkedList.insertValue(2);
    circularLinkedList.insertValue(8);
    circularLinkedList.insertValue(17);
    circularLinkedList.display();
    circularLinkedList.delete(17);
    circularLinkedList.display();
  }
}
