package objectsBasicsMandatoryPracticalTasks.Dogs;

class Dog {
    String name, age, size;

    Dog(String name, String age, String size) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.printDog();
    }

    public static String getRandomElement(String[] arrName) {
        int x = arrName.length;
        int rand = (int) (Math.random() * x);
        return arrName[rand];
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return Integer.parseInt(this.age);
    }
    public String getSize(){
        return this.size;
    }
    public void printDog(){
        System.out.print("Dog: " + this.name + " age: " + this.age + " and size is " + this.size + "\n");
    }
//    public Dog[] getDog(String name, String age, String size, int i) {
//        return new Dog[i];
//    }


//    public Dog getDog(Name dogName, Age dogAge, Size dogSize) {
//
//    }


}
