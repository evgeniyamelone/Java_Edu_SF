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
        personList2.add(new Person("John", 25));
        personList2.add(new Person("Stephen", 16));
        personList2.add(new Person("Stephen", 10));
        personList2.add(new Person("John", 25));
        personList2.add(new Person("Rose", 24));

        List<Person> personList3 = new LinkedList<>();
        personList3.add(new Person("John", 25));
        personList3.add(new Person("Stephen", 16));
        personList3.add(new Person("Stephen", 10));
        personList3.add(new Person("John", 25));
        personList3.add(new Person("Rose", 24));
        personList3.add(new Person("Ariel", 19));

        List<Person> sortedList = sort2(personList3);
        System.out.println("\nSorted list3 of persons: ");
        printOut(sortedList);

        System.out.println("\nList of persons: ");
        printOut(personList1);

        personList1.sort(new PersonsComparator());
        System.out.println("\nSorted list of persons: ");
        printOut(personList1);

        personList2.sort(new PersonsComparator());
        System.out.println("\nSorted list2 of persons: ");
        printOut(personList2);

        List<Person> uniqueList = uniquePersons(personList1);
        System.out.println("\nList of unique persons: ");
        printOut(uniqueList);

        boolean equalResult = equalLists(personList1, personList2);
        System.out.println("\nLists are equal: " + equalResult);
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
        for (Person e : personList) {
            if (comparePersons.compare(e, person) == 0) {
                containsResult = true;
            }
        }
        return containsResult;
    }

    public static boolean equalLists(List<Person> personList1, List<Person> personList2) {
        Iterator<Person> iter = personList1.iterator();
        boolean containsResult = false;
        if (personList1.size() != personList2.size()) {
            containsResult = false;
        } else {
            while (iter.hasNext()) {
                Person next = iter.next();
                if (!contains(personList2, next)) {
                    containsResult = false;
                } else {
                    containsResult = true;
                }
            }
        }
        return containsResult;
    }

    public static List<Person> sort2(List<Person> personList) {
        List<Person> sortedList = new LinkedList<>();
        Iterator<Person> iter = personList.iterator();
        Person next = iter.next();
        while (iter.hasNext())
            for (Person e : personList) {
                if (e.toString().compareToIgnoreCase(next.toString()) == 1) {
                    sortedList.add(e);
                }
            }
        return sortedList;
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


