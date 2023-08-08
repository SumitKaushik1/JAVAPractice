package comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Student s1=new Student(2588,26,200);
        Student s2=new Student(240,22,502);
        Student s3=new Student(500,2400,400);

        ArrayList<Student> l=new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        System.out.println(l.toString());
        //Collections.sort(l,new SortByMathMarks());
       // Collections.sort(l,new SortByHindiMarks());
        Collections.sort(l,new SortByScienceMarks());
        System.out.println(l.toString());




    }

}
