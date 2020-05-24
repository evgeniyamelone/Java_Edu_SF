package linkedList;

public class LinkedList<T> {
    Node head = null;
    Node tail = null;

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
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            Node k = n1.next;
            if (k != null) {
                k.prev = n;
            }
        }
    }

    public int size(T list) {
        int i = 0;
        Node n = head;
        while (n.next != null) {
            n = n.next;
            i++;
        }
        return i;
    }

    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}