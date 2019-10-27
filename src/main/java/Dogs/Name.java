package Dogs;

public class Name {
    String[] arrName = {"Bark Twain", "Chewbarka", "Doc McDoggins", "Droolius Caesar", "Franz Fur-dinand", "Fyodor Dogstoevsky", "Hairy Paw-ter"};

    public String getDogName() {
        int x = arrName.length;
        int rand = (int) (Math.random() * x);
        String s = arrName[rand];
        return s;
    }
}

