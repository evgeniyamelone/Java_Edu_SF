package personList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActions {
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

    public static void printOut(List<Person> personList1) {
        for (Person p : personList1) {
            System.out.println(p);
        }
    }

    public static List<Person> uniquePersons(List<Person> personList) {
        List<Person> uniqueList = new ArrayList<>();
        ListActions action = new ListActions();
        Iterator<Person> iter = personList.iterator();
        while (iter.hasNext()) {
            Person next = iter.next();
            if (!action.contains(uniqueList, next)) {
                uniqueList.add(next);
            }
        }
        return uniqueList;
    }

    public static List<Person> sort2(List<Person> personList) {
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
        return personList;
    }
}