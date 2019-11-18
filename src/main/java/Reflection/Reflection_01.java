package Reflection;

import java.lang.reflect.Method;

public class Reflection_01 {
}
/* Java program to call private method of a class from another class*/
/* The class containing a private method and a public method*/

class Check {

    // Private method
    private void private_Method() {
        System.out.println("Private Method "
                + "called from outside");
    }

    // Public method
    public void printData() {
        System.out.println("Public Method");
    }
}

// Driver code
class GFG {

    public static void main(String[] args) throws Exception {
        Check c = new Check();

        // Using getDeclareMethod() method
        Method m = Check.class.getDeclaredMethod("private_Method");

        // Using setAccessible() method
        m.setAccessible(true);

        // Using invoke() method
        m.invoke(c);
    }
}
/*____________________________________________________________________________________________________________________________________________________*/

// Java program to call private method
// of a class from another class

// The class contains a private method
class Check_01 {

    // Private method
    private void Demo_private_Method() {
        System.out.println("Private Method "
                + "called from outside");
    }

    // Public method
    public void printData() {
        System.out.println("Public Method");
    }
}

// Driver code
class GFG_01 {

    public static void main(String[] args)
            throws Exception {
        Check_01 c        = new Check_01();
        Method   m;
        Method   method[] = Check_01.class.getDeclaredMethods();         // Using getDeclareMethod() method

        for (int i = 0; i < method.length; i++) {
            String meth
                    = new String(method[i].toString());
            if (meth.startsWith("private")) {

                String s = method[i].toString();

                int a = s.indexOf(".");
                int b = s.indexOf("(");

                // Method name retrieved
                String method_name = s.substring(a + 1, b);

                // Print method name
                System.out.println("Method Name = "
                        + method_name);

                // Using getDeclareMethod() method
                m = Check_01.class.getDeclaredMethod(method_name);

                // Using setAccessible() method
                m.setAccessible(true);

                // Using invoke() method
                m.invoke(c);
            }
        }
    }
}
