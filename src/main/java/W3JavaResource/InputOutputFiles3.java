package W3JavaResource;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputOutputFiles3 {
    public static void main(String[] args) {

        String FilePath = System.getProperty("user.dir") + "\\src\\main\\resources";
        System.out.println(FilePath);
        String ext = "yml";
        java.util.List<String> a2 =  getallfiles(FilePath,ext);
        System.out.println(a2);

    }
        public static java.util.List<String> getallfiles(String filePath, String extension){
        // specfic files by extensions from a specfic folder exist or not
         File        file     = new File(filePath);
            List<String> a1       = new ArrayList<String>();

            if(file.exists()){
             String[]               fileList = file.list();
             for(String name : fileList){
                 System.out.println(name);
                 if(name.toLowerCase().contains(extension)){
                     a1.add(name);
                 }
             }
         }
            return a1;

    }
}
