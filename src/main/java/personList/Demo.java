package personList;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Person> personList1 = new LinkedList<>();
        personList1.add(new Person("John", 25));
        personList1.add(new Person("Rose", 24));
        personList1.add(new Person("Stephen", 16));
        personList1.add(new Person("Stephen", 10));
        personList1.add(new Person("John", 25));

        List<Person> personList2 = new LinkedList<>();
        personList2.add(new Person("George", 25));
        personList2.add(new Person("Rose", 24));
        personList2.add(new Person("Paul", 16));
        personList2.add(new Person("Stephen", 10));
        personList2.add(new Person("Ringo", 25));

        System.out.println("\nList of persons: ");
        printOut(personList1);

        personList1.sort(new PersonsComparator());
        System.out.println("\nSorted list of persons: ");
        printOut(personList1);

        List<Person> uniqueList = uniquePersons(personList1);
        System.out.println("\nList of unique persons: ");
        printOut(uniqueList);
    }

    public static void printOut(List<Person> personList1) {
        for (Person p : personList1) {
            System.out.println(p);
        }
    }

    public static List<Person> uniquePersons(List<Person> personList) {
        List<Person> uniqueList = new LinkedList<>();
        Iterator<Person> iter = personList.iterator();
        while (iter.hasNext()) {
            Person next = iter.next();
            if (!contains(uniqueList, next)) {
                uniqueList.add(next);
            }
        }
        return uniqueList;
    }

    public static boolean contains(List<Person> personList, Person person) {
        boolean containsResult = false;
        PersonsComparator comparePersons = new PersonsComparator();
        for (Person e : personList){
            if (comparePersons.compare(e, person) == 0) {
                containsResult = true;
            }
    }
        return containsResult;
}

}
//
//    public LinkedList uniquePerson(LinkedList personList1) {
//        PersonsComparator personComp = new PersonsComparator();
//        Iterator<Person> iter = personList1.iterator();
//        while (iter.hasNext()) {
//            for (int i = 0; i < personList1.size()+1; i++) {
//                personComp(iter.next().compareTo(iter));
//            }
//        }
//
//    }
//        return personList1;


