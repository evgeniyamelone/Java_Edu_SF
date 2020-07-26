package personList;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Person> personList1 = new ArrayList<>();
        personList1.add(new Person("John1", 25));
        personList1.add(new Person("Rose", 24));
        personList1.add(new Person("Stephen", 16));
        personList1.add(new Person("Stephen", 10));
        personList1.add(new Person("John", 25));

        List<Person> personList2 = new ArrayList<>();
        personList2.add(new Person("John", 25));
        personList2.add(new Person("Stephen", 16));
        personList2.add(new Person("Stephen", 10));
        personList2.add(new Person("John", 25));
        personList2.add(new Person("Rose", 24));

        List<Person> personList3 = new ArrayList<>();
        personList3.add(new Person("John", 25));
        personList3.add(new Person("Stephen", 16));
        personList3.add(new Person("Stephen", 10));
        personList3.add(new Person("John", 25));
        personList3.add(new Person("Rose", 24));
        personList3.add(new Person("Ariel", 19));

        System.out.println("\nList1 of persons: ");
        ListActions.printOut(personList1);

        System.out.println("\nList2 of persons: ");
        ListActions.printOut(personList2);

        System.out.println("\nList3 of persons: ");
        ListActions.printOut(personList3);

        personList1.sort(new PersonsComparator());
        System.out.println("\nSorted list of persons: ");
        ListActions.printOut(personList1);

        personList2.sort(new PersonsComparator());
        System.out.println("\nSorted list2 of persons: ");
        ListActions.printOut(personList2);

        ListActions.sort2(personList3);
        System.out.println("\nSorted list3 of persons: ");
        System.out.println(personList3);

//        TreeSet<Person> uniqueList = ListActions.uniquePersons(personList1);
//        System.out.println("\nList of unique persons: ");
//       // ListActions.printOut(uniqueList);
//        System.out.println(uniqueList);

        boolean equalResult = ListActions.equalLists(personList1, personList2);
        System.out.println("\nLists are equal: " + equalResult);
    }
}
