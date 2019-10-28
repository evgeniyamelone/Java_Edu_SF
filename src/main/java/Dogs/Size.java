package Dogs;

class Size {
    private String[] dogSize = {"small", "big", "medium"};

    String getSize() {
        int x = dogSize.length;
        int rand = (int) (Math.random() * x);
        return dogSize[rand];
    }
}
