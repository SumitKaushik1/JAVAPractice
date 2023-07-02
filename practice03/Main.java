// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          int max=Integer.MIN_VALUE;
          if(a>b&& a>c)
              max=a;
          else if(b>a&& b>c)
              max=b;
          else
              max=c;
          //i can do like c>a && c>b but it is obvious if a and b are not max obviiouly c is max
        System.out.println(max);
        //exit code is 0 ie programm successful


        sc.close();

    }
}