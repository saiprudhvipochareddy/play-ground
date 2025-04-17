package Collections.LinkedList;

public class StriverDoublyLinkedList {

  public static class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data, Node next, Node prev) {
      this.data = data;
      this.next = next;
      this.prev = prev;
    }

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public Node arrayToDLL() {
    int[] arr = {1, 3, 4, 7, 8};
    Node head = new Node(arr[0]);
    Node temp = head;
    for (int i = 1; i < arr.length; i++) {
      Node newNode = new Node(arr[i], null, temp);
      temp.next = newNode;
      temp = newNode;
    }
    return head;
  }

  public Node deleteHead(Node head) {
    if (head == null || head.next == null) {
      return null;
    }
    Node temp = head;
    head = head.next;
    head.prev = null;
    temp.next = null;

    return head;
  }

  public Node deleteTail(Node head) {
    if (head == null || head.next == null) {
      return null;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    Node previous = temp.prev;
    previous.next = null;
    temp.prev = null;

    return head;
  }

  public Node deleteNthNode(Node head, int x) {
    if (head == null) {
      return null;
    }

    int count = 1;
    Node temp = head;
    while (temp != null) {
      if (count == x) {
        break;
      }
      count++;
      temp = temp.next;
    }
    Node previous = temp.prev;
    Node front = temp.next;

    if (previous == null && front == null) {
      return null;
    } else if (previous == null && front != null) {
      head = head.next;
      temp.next = null;
      head.prev = null;
      return head;
    } else if (previous != null && front == null) {
      temp.prev = null;
      previous.next = null;
      return head;
    } else {
      temp.prev = null;
      temp.next = null;
      previous.next = front;
      front.prev = previous;
      return head;
    }
  }

  public void traverse(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public void deleteGivenNode(Node node) {
    Node back = node.prev;
    Node front = node.next;

    node.next = null;
    node.prev = null;

    if (front == null) {
      back.next = null;
    } else {
      back.next = front;
      front.prev = back;
    }
  }

  public Node insertBeforeHead(Node head, int val) {
    Node newNode = new Node(val);
    if (head == null) {
      return newNode;
    }

    newNode.next = head;
    head.prev = newNode;
    head = newNode;

    return head;
  }

  public Node insertBeforeTail(Node head, int val) {
    if (head.next == null){
      return insertBeforeHead(head, val);
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    Node back = temp.prev;
    Node newNode = new Node(val, temp, back);
    back.next = newNode;
    temp.prev = newNode;

    return head;
  }


  public static void main(String[] args) {
    StriverDoublyLinkedList dll = new StriverDoublyLinkedList();
    Node head = dll.arrayToDLL();
    dll.traverse(head);
    head = dll.deleteHead(head);
    dll.traverse(head);
//    head = dll.deleteHead(null);
//    dll.traverse(head);
    Node newNode = new Node(1);
    newNode = dll.deleteHead(newNode);
    dll.traverse(newNode);
    head = dll.deleteTail(head);
    dll.traverse(head);
//    head = dll.deleteTail(new Node(1));
//    dll.traverse(head);
    head = dll.deleteNthNode(head, 2);
    dll.traverse(head);
    Node head3 = dll.arrayToDLL();
    dll.traverse(head3);
    dll.deleteGivenNode(head3.next);
    dll.traverse(head3);
    dll.deleteGivenNode(head3.next.next);
    dll.traverse(head3);
    dll.deleteGivenNode(head3.next.next);
    dll.traverse(head3);
    dll.deleteGivenNode(head3.next);
    dll.traverse(head3);
  }

}
