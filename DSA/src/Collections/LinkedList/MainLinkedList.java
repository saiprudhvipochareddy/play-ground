package Collections.LinkedList;

import org.w3c.dom.Node;

public class MainLinkedList {
  public static void main(String[] args){
    LinkedList linkedList = new LinkedList();
    linkedList.insertFirst(3);
    linkedList.insertFirst(2);
    linkedList.insertFirst(8);
    linkedList.insertFirst(17);

    linkedList.insertLast(99);
    linkedList.insert(100,3);

    linkedList.display();

    System.out.println(linkedList.deleteFirst());

    linkedList.display();

    System.out.println(linkedList.deleteLast());

    linkedList.display();

    System.out.println(linkedList.deleteIndex(2));

    linkedList.display();

    System.out.println(linkedList.find(2));

    linkedList.insertRec(88, 2);

    linkedList.display();
  }

}
