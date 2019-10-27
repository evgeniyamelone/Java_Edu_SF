package Dogs;

public class Size {
    String[] dogSize = {"small", "big", "medium"};

    public String getSize() {
        int x = dogSize.length;
        int rand = (int) (Math.random() * x);
        String s = dogSize[rand];
        return s;
    }


}
