package Encapulation;

public class datahidingC {
    private int ssn;
    public String name;
    public int age;

    public int getSsn(){
        return ssn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        datahidingC dc = new datahidingC();
        dc.setSsn(12346789);
        dc.setAge(12);
        dc.setName("dee");
        System.out.println(dc.getName()+"-"+dc.getAge()+"-"+dc.getSsn());
    }
}
