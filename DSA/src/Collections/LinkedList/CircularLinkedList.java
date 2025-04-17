package Collections.LinkedList;

public class CircularLinkedList {

  private Node head;
  private Node tail;

  public void insertValue(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    }
    tail.next = newNode;
    newNode.next = head;
    tail = newNode;
  }

  public void display() {//Display circular linked list
    Node temp = head;
    if (head != null) {
      while (temp.next != head) {
        System.out.print(temp.value + " -> ");
        temp = temp.next;
      }
      System.out.print(temp.value + " -> ");
    }
    System.out.println("HEAD");
  }

//  public void display() {
//    Node temp = head;
//    if (head != null) {
//      do {
//        System.out.print(temp.value + " -> ");
//        temp = temp.next;
//      } while (temp != head);
//    }
//    System.out.println("END");
//  }

  public void delete(int value) {
    Node node = head;
    if (node == null) {
      return;
    }
    if (node.value == value) {
      head = head.next;
      tail.next = head;
      return;
    }
    while (node.next != head){
      Node nextNode = node.next;
      if (nextNode.value == value) {
        node.next = nextNode.next;
        break;
      }
      node = node.next;
    }
  }


  private class Node {

    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}
