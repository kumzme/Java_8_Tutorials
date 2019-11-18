package W3JavaResource;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputOutputFiles {
    public static void main(String[] args) {

        String FilePath = System.getProperty("user.dir") + "\\src\\main\\resources";
        System.out.println(FilePath);
        List<String> a2 =  getallfiles(FilePath);
        System.out.println(a2);

    }
        public static List<String> getallfiles(String filePath){
        //Get all the files from a specfic folder
         File file = new File(filePath);
          String[] fileList = file.list();
          List<String> a1 = new ArrayList<String>();
        for(String name : fileList){
          System.out.println(name);
           a1.add(name);
        }
       return a1;
    }
}
