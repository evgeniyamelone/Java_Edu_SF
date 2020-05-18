package personList;

import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        int nameResult = p1.getName().compareTo((p2.getName()));
        if (nameResult == 0) {
            return p1.getAge().compareTo((p2.getAge()));
        }
        return nameResult;
    }
}

