package linkedList;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insert(10);
        list.insert(1);
        list.deleteAt(4);
        list.show();

    }

}

