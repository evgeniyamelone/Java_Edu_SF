package Dogs;

public class Age {
    int[] age;

    void createDogsAge() {
        int[] arrAge = new int[20];
        for (int i = 0; i < 20; i++) {
            arrAge[i] = i + 1;
        }
        this.age = arrAge;
    }

    public int getDogsAge() {
        this.createDogsAge();
        int x = this.age.length;
        int rand = (int) (Math.random() * x);
        int s = this.age[rand];
        return s;
    }
}
