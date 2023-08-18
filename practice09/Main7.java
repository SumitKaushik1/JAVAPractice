import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main7 {

    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
         Set<Integer> s1=Set.of(1,2,3,4,7);
        Set<Integer> s2=Set.of(1,2,3,4,5);
        Set<Integer> s3=new LinkedHashSet<>();


        s3.addAll(s1);
        s3.addAll(s2);
       /* for(int i=0;i<4;i++){
            s1.add(i);
        }

        for(int i=0;i<4;i++){
            s2.add(i);
        }*/


      /* for(int i:s1){
            s3.add(i);
        }
        for(int i:s2) {
            s3.add(i);
        }*/

        System.out.println(s3);

         scan.close();
    }
}
