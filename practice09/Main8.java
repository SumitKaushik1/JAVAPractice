import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main8 {

    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        Set<Integer> s1=Set.of(1,2,3,4,7);
        Set<Integer> s2=Set.of(1,2,3,4,5);
        Set<Integer> s3=new LinkedHashSet<>();


        s3.addAll(s1);
        s3.retainAll(s2);//ie s3 has values so only stop the s2 elements remove all other elements

       System.out.println(s3);
       scan.close();
}
}
