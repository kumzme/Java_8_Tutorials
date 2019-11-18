public class example1 {

    public static void main(String[] args){

        System.out.println(test());


    }
    public static int test(){

        try{
            return 0;
        }
        finally {
            System.out.println("finally trumps return");
        }
    }
//    public static void stringWritter(){
//
//        StringWriter writer = new StringWriter();
//        IOUtils.copy(inputStream, writer, "UTF-8");
//        return writer.toString();
//
//    }
    /*


    HashMap Vs HAshTable
    HashTable:
      1.Synchronized, [ means one thread can modify a Hash table at one point of time. it means, any thread before performing
                       an update on a hashtable will have acquire a lock on the object while other will wait for lock to be released.]
      2. does not allow null values
    HashMap:
         1.is better for not Synchronized objects.
         2. allows null values

     */
}
