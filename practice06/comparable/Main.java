package comparable;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Student s1=new Student(2588,26,200);
       Student s2=new Student(240,22,502);
       Student s3=new Student(500,2400,400);

        List<Student>l=new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        System.out.println(l.toString());
        Collections.sort(l);
        System.out.println(l.toString());




    }
}