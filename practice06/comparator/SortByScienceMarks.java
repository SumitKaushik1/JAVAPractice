package comparator;

import java.util.Comparator;

public class SortByScienceMarks  implements Comparator<Student> {
    @Override
    public int compare(Student o1,Student o2){
        //has to return -1.0,1 ,Integer wraper class has already compare method static

        return Integer.compare(o1.getScience(),o2.getScience());
    }

}
