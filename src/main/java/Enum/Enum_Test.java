package Enum;

enum Color {
    RED, GREEN, BLUE, Yellow;
}

public class Enum_Test {
    // Driver method
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1.name());
        System.out.println(c1.compareTo(Color.BLUE));
        System.out.println(c1.compareTo(Color.RED));
        System.out.println(c1.compareTo(Color.GREEN));
        System.out.println(c1.compareTo(Color.Yellow));
    }
}
