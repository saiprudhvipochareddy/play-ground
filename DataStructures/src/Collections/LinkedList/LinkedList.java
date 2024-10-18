package Collections.LinkedList;


import org.w3c.dom.Node;

public class LinkedList {

  private Node head;
  private Node tail;// benefit of taking tail here is when we want to insert at last we can directly
  // add it in constant time 0(1)
  private int size;

  public LinkedList() {
    this.size = 0;
  }

  public void insertFirst(int value) {//Insertion First in singly linked list
    Node node = new Node(value);
    node.next = head;
    head = node;
    if (tail == null) {
      tail = head;
    }
    size += 1;
  }

  public void insertLast(int value) {//Insertion Last in singly linked list
    if (tail == null) {
      insertFirst(value);
      return;
    }
    Node node = new Node(value);
    tail.next = node;
    tail = node;
    size++;
  }

  public void insert(int value, int index) {//Insert at particular index
    if (index == 0) {
      insertFirst(value);
    }
    if (index == size) {
      insertLast(value);
    }
    Node temp = head;
    for (int i = 1; i < index; i++) {
      temp = temp.next;
    }
    Node newNode = new Node(value, temp.next);
    temp.next = newNode;
    size++;
  }

  public Integer deleteFirst() {//Delete First in singly linked list
    int val = head.value;
    head = head.next;
    if (head == null) {
      tail = null;
    }
    size--;
    return val;
  }

  public Integer deleteLast() {//Delete Last in singly linked list
    if (size <= 1) {
      return deleteFirst();
    }
    Node secondLast = getIndex(size - 2);
    int val = tail.value;
    tail = secondLast;
    tail.next = null;
    return val;
  }

  public Integer deleteIndex(int index) {//Delete Last in singly linked list
    if (index == 0) {
      return deleteFirst();
    }
    if (index == size - 1) {
      return deleteLast();
    }
    Node previous = getIndex(index - 1);
    int val = previous.next.value;
    previous.next = previous.next.next;

    return val;
  }

  public Node find(int value) {
    Node node = head;
    while (node != null) {
      if (node.value == value) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public Node getIndex(int index) {
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  public void display() {//Display singly linked list
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("END");
  }

  // insert using recursion
  public void insertRec(int val, int index) {
    head = insertionWithRec(val, index, head);
  }

  private Node insertionWithRec(int val, int index, Node node) {
    if (index == 0) {
      Node newNode = new Node(val, node);
      size++;
      return newNode;
    }

    node.next = insertionWithRec(val, index-1, node.next);
    return node;
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
