package Static;

/* Java program to show that if static method is redefined by
a derived class, then it is not overriding. */

public class Static_Block_02 {

    // static block
    static {
        System.out.println("Inside Static Block.");
    }

    // main method
    public static void main(String args[]) {
        System.out.println("Inside main method.");
    }

    /*
        Conclusion:
        Any time a static method is called and if it has a static block, then it will be invoked first
    */
}
