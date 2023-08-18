import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main10 {


    public static  void main  (String args[]) {

        //Set<Integer> s1 = Set.of(1, 2, 3);
        Set<Integer> s1 = Set.of(27);
        Set<Integer> s2 = Set.of(1, 2, 3, 4, 5);
        boolean b = s2.containsAll(s1);
        System.out.println(b);
    }

}
