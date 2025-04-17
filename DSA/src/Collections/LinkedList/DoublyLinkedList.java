package Collections.LinkedList;

public class DoublyLinkedList {

  private Node head;

  public void insertFirst(int value) {
    Node node = new Node(value);
    node.next = head;
    node.previous = null;
    if (head != null) {
      head.previous = node;
    }
    head = node;
  }

  public void insertLast(int value) {
    Node node = new Node(value);
    Node last = head;
    node.next = null;
    if (head == null) {
      node.previous = null;
      head = node;
    }
    while (last.next != null) {
      last = last.next;
    }
    last.next = node;
    node.previous = last;
  }

  public void insertAfter(int after, int value) {//Insert after given value
    Node previousNode = find(after);
    if (previousNode == null) {
      System.out.println("does not exist");
      return;
    }

    Node newNode = new Node(value);
    newNode.next = previousNode.next;
    previousNode.next = newNode;
    newNode.previous = previousNode;
    if (newNode.next != null) {
      newNode.next.previous = newNode;
    }
  }

  public Node find(int value){
    Node node = head;
    while(node != null){
      if(node.value == value) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public void display(){
    Node temp = head;
    Node last = null;
    while(temp != null){
      System.out.print(temp.value+ " -> ");
      last = temp; //It will get assigned with last node
      temp = temp.next;
    }
    System.out.println("END");

    System.out.println("Print in reverse");
    while(last != null){
      System.out.print(last.value+ " -> ");
      last = last.previous;
    }
    System.out.println("START");
  }

  private class Node {

    private int value;
    private Node next;
    private Node previous;

    public Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next, Node previous) {
      this.value = value;
      this.next = next;
      this.previous = previous;
    }
  }
}
