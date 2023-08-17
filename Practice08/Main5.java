import java.util.*;

public class Main5 {

    public static void main(String args []){
       List<String> l=new ArrayList<>();

        List<String> l1=new ArrayList<>();
        l.add("first");
        l.add("first");
        l.add("second");
        String s="second";

        for(int i=0;i<l.size();i++)
            if(l.get(i).equals(s))
               l.set(i,"0");

        for(String s1:l)
            if(!s1.equals("0"))
                l1.add(s1);




        System.out.println(l1);
       }

}

