package linkedList;

import java.util.Iterator;

public class LinkedList<T> {
    Node head;
    Node tail;
    int currentIndex = 0;

    public void insert(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.prev = null;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            node.prev = n;
            n.next = node;
            tail = n.next;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
            head.prev = null;
        } else {
            Node previousNode = head;
            Node nodeToDelete;
            Node nextNode;
            for (int i = 0; i < index - 1; i++) {
                previousNode = previousNode.next;
            }
            nodeToDelete = previousNode.next;
            previousNode.next = nodeToDelete.next;
            nextNode = nodeToDelete.next;
            if (nextNode != null) {
                nextNode.prev = previousNode;
            }
            nodeToDelete.prev = null;
        }
    }

    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void reverse() {
        Node prev = null;
        Node node = head;
        Node next;
        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        head = prev;
    }

    public boolean hasNext() {
        if (currentIndex == 0) {
            return head.next != null;
        }
        Node currentNode = head;

        for (int i = 0; i < currentIndex - 1; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.next != null;
    }

    public Node next() {
        Node currentNode = head;

        for (int i = 0; i < currentIndex; i++) {
            currentNode = currentNode.next;
        }
        currentIndex++;
        return currentNode;
    }
}