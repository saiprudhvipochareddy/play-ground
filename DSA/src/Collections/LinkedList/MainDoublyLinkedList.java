package Collections.LinkedList;

public class MainDoublyLinkedList {
  public static void main(String[] args){
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.insertFirst(3);
    doublyLinkedList.insertFirst(2);
    doublyLinkedList.insertFirst(8);
    doublyLinkedList.insertFirst(17);

    doublyLinkedList.insertLast(99);
    doublyLinkedList.insertAfter(99,65);
    doublyLinkedList.insertAfter(8,63);
//    linkedListExample.insert(100,3);
//
//    linkedListExample.display();
//
//    System.out.println(linkedListExample.deleteFirst());

    doublyLinkedList.display();

//    System.out.println(linkedListExample.deleteLast());
//
//    linkedListExample.display();
//
//    System.out.println(linkedListExample.deleteIndex(2));
//
//    linkedListExample.display();
//
//    System.out.println(linkedListExample.find(2));

  }
}
