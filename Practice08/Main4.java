import java.util.*;
public class Main4 {

    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        Map<String,Integer>m=new HashMap<>();
        List<String> l = Arrays.asList("apple", "banana", "apple", "orange", "apple");
       // List<String> l=new ArrayList<>();
       /* l.add("bat");
        l.add("owl");
        l.add("bat");
        l.add("bat");*/
       for(String s:l){

           if(m.containsKey(s)){
               m.put(s,m.get(s)+1);
           }else m.put(s,1);

       }

        System.out.println(m);

        scan.close();


    }
}
