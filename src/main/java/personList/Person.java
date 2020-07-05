package personlist;

import org.jetbrains.annotations.NotNull;

public class Person {
    private String name;
    private int age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int comparePersons(Person anotherPerson) {
        if (this.age > anotherPerson.age)
            return -1;
        else
            return 0;
    }

    public String getName() {
        return name;
    }

    @Override
    @NotNull
    public String toString() {
        return name + ": " + age;
    }

}


