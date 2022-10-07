package com.company.task1;

public class MyQueue {

  Node head;

  public MyQueue insert(MyQueue list, int data) {
    Node new_node = new Node(data);
    new_node.next = null;

    if (list.head == null) {
      list.head = new_node;
    } else {
      Node last = list.head;
      while (last.next != null) {
        last = last.next;
      }

      last.next = new_node;
    }

    return list;
  }

  public void printList(MyQueue list) {
    Node currNode = list.head;

    System.out.print("\nMyQueue: ");

    while (currNode != null) {
      System.out.print(currNode.data + " ");

      currNode = currNode.next;
    }
    System.out.println("\n");
  }

  public MyQueue deleteByKey(MyQueue list, int key) {
    Node currNode = list.head, prev = null;

    if (currNode != null && currNode.data == key) {
      list.head = currNode.next; // Changed head

      System.out.println(key + " found and deleted");

      return list;
    }

    while (currNode != null && currNode.data != key) {
      prev = currNode;
      currNode = currNode.next;
    }

    if (currNode != null) {

      prev.next = currNode.next;

      System.out.println(key + " found and deleted");
    }

    if (currNode == null) {
      System.out.println(key + " not found");
    }
    return list;
  }

  public MyQueue deleteAtPosition(MyQueue list, int index) {
    Node currNode = list.head, prev = null;

    if (index == 0 && currNode != null) {
      list.head = currNode.next;

      System.out.println(index + " position element deleted");

      return list;
    }

    int counter = 0;

    while (currNode != null) {

      if (counter == index) {
        prev.next = currNode.next;

        System.out.println(index + " position element deleted");
        break;
      } else {
        prev = currNode;
        currNode = currNode.next;
        counter++;
      }
    }

    if (currNode == null) {
      System.out.println(index + " position element not found");
    }

    return list;
  }

  class Node {

    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }
}
