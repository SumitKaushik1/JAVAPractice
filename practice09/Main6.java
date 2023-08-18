import java.util.*;

public class Main6 {

    public static void main(String args[]){
        try(Scanner scan=new Scanner(System.in)){
            List<Integer> l=new ArrayList<>();
            int n=scan.nextInt();

            for(int i=0;i<n;i++){
                l.add(scan.nextInt());
            }

            //in back linked list structure is used
            //order is maintained in linked list
            Set<Integer> s=new LinkedHashSet<>(l);
            //dublicates will be removed in set

            //  List<Integer> l1=new ArrayList<>(s);

            System.out.println(s.toString());
        }
    }
}
