package Inheritance;

public class inheritC  extends Inheritance1 {
    public String aa(){
        String book = "Science";
        System.out.println(" -------");
        System.out.println("booking");

        return book;
    }
    public static void main(String[] args){

       inheritC xx = new inheritC();
       System.out.println(xx.books);
       System.out.println(xx.desigantion);
       System.out.println(xx.aa());

    }
}
