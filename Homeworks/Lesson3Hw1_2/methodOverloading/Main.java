package methodOverloading;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.toAdd(2, 3));
        System.out.println(addition.toAdd(2, 3, 5));
    }
}
