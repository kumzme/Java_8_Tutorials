package Cap_One;

import java.util.Arrays;

public class aarraytest5 {

    public static void main(String[] args){
        int aa[] = {10,20,12,23432,1234,45526};
        int aa2[]  = xx1(aa);
        System.out.println(aa2[1]);
    }

    public static void xx(int a1[]){
        int min  = Integer.MAX_VALUE;
        int seecond_min = Integer.MAX_VALUE;
        for(int i = 0; i <a1.length;i++){
            if(a1[i] ==min){
                seecond_min=min;
            }
            else if(a1[i]<min){
                seecond_min= min;
                min=a1[i];
            }else if(a1[i] <seecond_min){
                seecond_min=a1[i];
            }
        }
    }
    public static int[]  xx1(int a1[]){
        Arrays.sort(a1);
        return a1;

    }
}
