package W3JavaResource;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InputOutputFiles4 {
    public static void main(String[] args) {

        String FilePath = System.getProperty("user.dir") + "\\src\\main\\resources";
        System.out.println(FilePath);
        String ext = "yml";
        List<String> a2 =  getallfiles(FilePath,ext);
        System.out.println(a2);

    }
        public static List<String> getallfiles(String filePath, String extension){
        // specfic files last modified
         File              file = new File(filePath);
         List<String> a1   = new ArrayList<String>();
            if(file.exists()){
             String[]       fileList = file.list();
             Date date     = new Date(file.lastModified());
             System.out.println("file modified"+date);
             for(String name : fileList){
                 System.out.println(name + date);
                 if(name.toLowerCase().contains(extension)){
                     a1.add(name);
                     a1.add(date.toString());
                 }
             }
         }
            return a1;

    }
}
