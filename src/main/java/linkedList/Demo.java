package linkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.deleteAt(4);
        System.out.println("\nList: ");
        list.show();
        System.out.println("\nReverced list: ");
        list.reverse();
        list.show();

        System.out.println("\nIterate through linked list ");
        while(list.hasNext()){
            Node node = list.next();
            System.out.println(node.data);
        }
    }

}

