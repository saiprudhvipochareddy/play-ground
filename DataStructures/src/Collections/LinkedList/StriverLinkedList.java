package Collections.LinkedList;

public class StriverLinkedList {

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

  public Node arrayToLL() {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
    Node head = new Node(arr[0]);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = mover.next;
    }
    return head;
  }

  public boolean checkIfPresent(Node head, int val) {
    Node curr = head;
    while (curr != null) {
      if (curr.value == val) {
        return true;
      }
      curr = curr.next;
    }
    return false;
  }

  public Node deleteHead(Node head) {
    Node temp = head;
    if (temp == null) {
      return null;
    }
    return head.next;
  }

  public Node deleteTail(Node head) {
    Node temp = head;
    if (temp == null || temp.next == null) {
      return null;
    }
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
    return head;
  }

  /**
   * Delete given nth node.
   */

  public Node deleteNthNode(Node head, int n) {
    Node temp = head;
    if (temp == null) {
      return null;
    }
    if (n == 1) {
      return head.next;
    }

    int count = 1;
    Node prev = null;
    while (temp != null) {
      if (count == n) {
        prev.next = temp.next;
        return head;
      }
      prev = temp;
      count++;
      temp = temp.next;
    }
    return head;
  }

  public Node deleteNodeByValue(Node head, int value) {
    Node temp = head;
    if (temp == null) {
      return null;
    }
    if (head.value == value) {
      return head.next;
    }

    Node prev = null;
    while (temp != null) {
      if (temp.value == value) {
        prev.next = temp.next;
        return head;
      }
      prev = temp;
      temp = temp.next;
    }
    return head;
  }

  public void traverse(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public int length(Node head) {
    Node temp = head;
    int count = 0;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

  public Node insertFirst(Node head, int val) {
//    Node newNode = new Node(val);
//    Node temp = head;
//    head = newNode;
//    head.next = temp;
//    return head;
    Node temp = new Node(val, head);
    return temp;
  }

  public Node insertLast(Node head, int val) {
    if (head == null) {
      return new Node(val);
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    Node newNode = new Node(val);
    temp.next = newNode;
    newNode.next = null;

    return head;
  }

  /**
   * Approach1 with prev
   */
  public Node insertNodeBeforeKthNodeApproach1(Node head, int val, int n) {
    if (head == null) {
      return new Node(val);
    }
    if (n == 1) {
      return new Node(val, head);
    }
    int count = 1;
    Node prev = null;
    Node temp = head;
    while (temp.next != null) {
      if (count == n) {
        Node newNode = new Node(val);
        newNode.next = temp;
        prev.next = newNode;
        return head;
      }
      count++;
      prev = temp;
      temp = temp.next;
    }
    return head;
  }

  /**
   * Approach1 without prev
   */
  public Node insertNodeBeforeKthNodeApproach2(Node head, int val, int n) {
    if (head == null) {
      return new Node(val);
    }
    if (n == 1) {
      return new Node(val, head);
    }
    int count = 1;
    Node temp = head;
    while (temp != null) {
      if (count == n - 1) {
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
      }
      count++;
      temp = temp.next;
    }
    return head;
  }

  public Node insertNodeBeforeValue(Node head, int element, int val) {
    if (head == null) {
      return new Node(element);
    }
    if (head.value == val) {
      return new Node(element, head);
    }
    Node temp = head;
    while (temp.next != null) {
      if (temp.next.value == val) {
        Node newNode = new Node(element);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
      }
      temp = temp.next;
    }
    return head;
  }


  public static void main(String[] args) {
    StriverLinkedList linkedList = new StriverLinkedList();
    Node head = linkedList.arrayToLL();

    linkedList.traverse(head);
    System.out.println("Length of the linked list: " + linkedList.length(head));
    System.out.println("Check if 4 is present: " + linkedList.checkIfPresent(head, 4));
    System.out.println("Check if 40 is present: " + linkedList.checkIfPresent(head, 40));
    head = linkedList.deleteHead(head);
    linkedList.traverse(head);
    head = linkedList.deleteTail(head);
    linkedList.traverse(head);
    head = linkedList.deleteNthNode(head, 1);
    linkedList.traverse(head);
    head = linkedList.deleteNthNode(head, 3);
    linkedList.traverse(head);
    head = linkedList.deleteNodeByValue(head, 3);
    linkedList.traverse(head);
    head = linkedList.deleteNodeByValue(head, 6);
    linkedList.traverse(head);
    head = linkedList.insertFirst(head, 10);
    linkedList.traverse(head);
    head = linkedList.insertLast(head, 13);
    linkedList.traverse(head);
    head = linkedList.insertNodeBeforeKthNodeApproach1(head, 53, 1);
    linkedList.traverse(head);
    head = linkedList.insertNodeBeforeKthNodeApproach1(head, 54, 2);
    linkedList.traverse(head);
    head = linkedList.insertNodeBeforeKthNodeApproach2(head, 55, 1);
    linkedList.traverse(head);
    head = linkedList.insertNodeBeforeKthNodeApproach2(head, 56, 7);
    linkedList.traverse(head);
    head = linkedList.insertNodeBeforeKthNodeApproach2(head, 57, 10);
    linkedList.traverse(head);
    head = linkedList.insertNodeBeforeValue(head, 100, 10);
    linkedList.traverse(head);
    head = linkedList.insertNodeBeforeValue(head, 20, 13);
    linkedList.traverse(head);
    head = linkedList.insertNodeBeforeValue(head, 200, 14);
    linkedList.traverse(head);
  }

}
