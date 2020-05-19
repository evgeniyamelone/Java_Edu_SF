package personList;

public class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        return this.age.compareTo(anotherPerson.age);
    }

//    public int compareToIgnoreCase(Person anotherPerson) {
//        return this.name.compareTo(anotherPerson.name);
//    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString(){
        return name + ": "+ age;
    }

}


