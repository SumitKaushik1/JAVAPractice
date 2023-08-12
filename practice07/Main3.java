import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class Main3 {
      static  public void   main(String args[]){
          Scanner scan=new Scanner(System.in);
          List<Integer> l1=new ArrayList<>();
          int n=scan.nextInt();
          //System.out.println(n);
          for(int i=0;i<n;i++){
              l1.add(scan.nextInt());

          }System.out.println(l1);
          Stack<Integer> s=new Stack<>();
          for(int i:l1){
              s.push(i);
          }

          //clear will clear the current list and make size to zero
          // ,removeAll() will remove all the in the present list which is matching from other collection
          l1.clear();
          for(int i=0;i<n;i++){
              l1.add(s.pop());

          }

          System.out.println(l1);

          scan.close();

    }

}
