import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main9 {

    public static  void main  (String args[]){

        Scanner scan=new Scanner(System.in);
                String s=scan.nextLine();
                        char[]a= s.toCharArray();
                        //we need order
                         Set<Character> s1=new LinkedHashSet<>();

                        for(char c:a){
                            s1.add(c);

                        }
                    System.out.println(s1);

                scan.close();
    }


}
