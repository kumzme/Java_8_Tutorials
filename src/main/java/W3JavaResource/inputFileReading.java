package W3JavaResource;

import java.io.*;
import java.util.*;

public class inputFileReading {
    public static void main(String[] args) throws IOException {
        String FilePath = System.getProperty("user.dir") + "\\src\\main\\resources\\";
        String FileName = "cucumber01.yml";
        String fileN    = FilePath + FileName;
       List<String> a2 = readfile(fileN);
    }

    public static List<String> readfile(String FilePath) throws IOException {

        File           file = new File(FilePath);
        BufferedReader br   = new BufferedReader(new FileReader(FilePath));
        String sr;
        List<String> a1 = new java.util.ArrayList<String>();
        while ((sr = br.readLine() )!= null){
            System.out.println(sr);
            a1.add(sr);
        }
       return a1;
    }
}

