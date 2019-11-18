package Inheritance;

public class inheritC2 extends Inheritance2 {

    public static void main(String[] args){

        inheritC2 cc = new inheritC2();
       System.out.println( cc.getBooks());
       System.out.println(  cc.getCollegeName());
        cc.setBooks("Physics");
        cc.setCollegeName("xxx");
        cc.does();
    }
}
