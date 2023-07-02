// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double result =Math.cbrt(Math.pow(a,2)+Math.pow(b,2)-Math.abs(c));
        System.out.println(result);


        sc.close();

    }
}