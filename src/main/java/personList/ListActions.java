package personList;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ListActions implements Comparable{
    public static boolean contains(List<Person> personList, Person person) {
        PersonsComparator comparePersons = new PersonsComparator();
        for (Person e : personList) {
            if (comparePersons.compare(e, person) == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSet(Set<Person> personList, Person person) {
        PersonsComparator comparePersons = new PersonsComparator();
        for (Person e : personList) {
            if (comparePersons.compare(e, person) == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean equalLists(List<Person> personList1, List<Person> personList2) {
        Iterator<Person> iter = personList1.iterator();
        boolean containsResult = false;
        if (personList1.size() != personList2.size()) {
           return false;
        } else {
            while (iter.hasNext()) {
                Person next = iter.next();
                containsResult = contains(personList2, next);
            }
        }
        return containsResult;
    }

    public static boolean equalSets(Set<Person> personList1, Set<Person> personList2) {
        Iterator<Person> iter = personList1.iterator();
        boolean containsResult = false;
        if (personList1.size() != personList2.size()) {
            return false;
        } else {
            while (iter.hasNext()) {
                Person next = iter.next();
                containsResult = containsSet(personList2, next);
            }
        }
        return containsResult;
    }

    public static void printOut(List<Person> personList1) {
        for (Person p : personList1) {
            System.out.println(p);
        }
    }

    public static TreeSet<Person> uniquePersons(List<Person> personList) {
        TreeSet sorted = new TreeSet<>();
        for (Person e: personList){

        }

        return new TreeSet<>(personList);
    }

    public static void sort2(List<Person> personList) {
        int count = personList.size() * personList.size();
        do {
            for (int i = 0; i < personList.size() - 1; i++) {
                Person nextElement = personList.get(i + 1);
                int compareResult = personList.get(i).getName().compareTo(personList.get(i + 1).getName());
                if (compareResult < 0) {
                    personList.add(i, nextElement);
                    personList.remove(i + 2);
                }
            }
            count--;
        } while (count > 0);
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}
