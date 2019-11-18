package W3JavaResource;

public class InputOutputFiles2 {
    public static void main(String[] args) {

        String FilePath = System.getProperty("user.dir") + "\\src\\main\\resources";
        System.out.println(FilePath);
        String ext = "yml";
        java.util.List<String> a2 =  getallfiles(FilePath,ext);
        System.out.println(a2);

    }
        public static java.util.List<String> getallfiles(String filePath, String extension){
        //Get a specfic files by extensions from a specfic folder
         java.io.File            file     = new java.io.File(filePath);
          String[]               fileList = file.list();
          java.util.List<String> a1       = new java.util.ArrayList<String>();
        for(String name : fileList){
          System.out.println(name);
            if(name.toLowerCase().contains("yml")){
                a1.add(name);
            }
        }
       return a1;
    }
}
