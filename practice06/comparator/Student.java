package comparator;



// here you donot need the comparator ,now in comparable only one field you can compare to compare every filed you need
//comparator for each filed you need ot make teh sepearte class
public class Student {
private int maths;
private int science;
private int hindi;


    public Student(int maths, int science, int hindi) {
        this.maths = maths;
        this.science = science;
        this.hindi = hindi;
    }

    public int getMaths() {
        return maths;
    }

    public int getScience() {
        return science;
    }

    public int getHindi() {
        return hindi;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }








}
