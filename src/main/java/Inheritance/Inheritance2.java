package Inheritance;

public class Inheritance2 {
    private String books = "Teachings";

    private String collegeName = "ABC";

    public void setBooks(String books) {
        this.books = books;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getBooks(){
        return books;
    }
    public String getCollegeName(){
        return collegeName;
    }
    public void does(){
        System.out.println("Teaching Sc");
    }
}
