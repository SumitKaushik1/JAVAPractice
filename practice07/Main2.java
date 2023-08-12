import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main (String []args){
        Scanner scan=new Scanner(System.in);

        List<String > l1=new ArrayList<>();
        List<String > l2=new ArrayList<>();
        int n1=scan.nextInt();
        int n2=scan.nextInt();

        scan.nextLine();
        for(int i=0;i<n1;i++){
            l1.add(scan.nextLine());
        }

        for(int i=0;i<n2;i++){
            l2.add(scan.nextLine());
        }
       // System.out.println(l1);
        //System.out.println(l2);

        System.out.println(commonList(l1,l2));


        scan.close();

    }


    //static means at the calss level ,non static means at the instance level ,instance can be many so non static can be many  ,static is only one b/z class is only one
    static List<String> commonList(List<String> l1,List<String> l2){
        List<String> commonList=new ArrayList<>();

        for(int i=0;i<l1.size();i++){
            for(int j=0;j<l2.size();j++){
                if(l1.get(i).equals(l2.get(j)))
                {
                    //System.out.println(l1.get(i)+l2.get(j));
                    commonList.add(l1.get(i));
                    break; //the inner loop
                }
            }
        }

        return commonList;
    }



}
