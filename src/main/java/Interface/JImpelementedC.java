package Interface;

public class JImpelementedC implements JInterface, Interface.JInterface2 {

    public static void main(String[] args){

        JImpelementedC jimc = new JImpelementedC();
        jimc.dummy();;
        jimc.dummy2();
    }

    public void dummy() {
      System.out.println(Interface.JInterface.MyString);
    }
    public void dummy2(){
        System.out.println(Interface.JInterface2.strin2);
    }

}
