package comparator;
import java.util.Comparator;
public class SortByMathMarks implements Comparator<Student>{


    @Override
    public int compare(Student o1,Student o2){
        //has to return -1.0,1 ,Integer wraper class has already compare method static

        return Integer.compare(o1.getMaths(),o2.getMaths());
    }


}
