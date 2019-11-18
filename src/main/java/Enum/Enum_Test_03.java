package Enum;
// Java program to demonstrate that enums can have constructor
// and concrete methods.

// An enum (Note enum keyword inplace of class keyword)
enum Color1 {
    RED, GREEN, BLUE;

    // enum constructor called separately for each
    // constant
    private Color1() {
        System.out.println("Constructor called for : " +
                this.toString());
    }

    // Only concrete (not abstract) methods allowed
    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

public class Enum_Test_03 {
    // Driver method
    public static void main(String[] args) {
        Color1 c1 = Color1.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}
