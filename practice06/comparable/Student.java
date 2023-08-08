package comparable;
//Comparable<T> is the generic interface b/z<T> its inisde methods will change according T datatype

public class Student implements Comparable<Student>{
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


    //1.
    //for comparable<T> interface ,for only hindi

    /*
    @Override
      public int compareTo(comparable.Student s){

        //  student class has compareTo ie it can compare only one of its field
       //   either hindi or math or science. at the time ie the natural ordering
        //  suppose i want to sort with hindi

       //    you have ot return the +1,-1,0 b.z compareTo will return this only
          // compare is the static method in Integer wrapper class

         // return  Integer.compare(this.hindi,s.getHindi());// ascending
          return  Integer.compare(s.getHindi(),this.hindi);// descending

    }
*/

    //2.
    //for comparable<T> interface ,for only science
    //for science
   // @Override
  /*  public int compareTo(comparable.Student s){

        //  student class has compareTo ie it can compare only one of its field
        //   either hindi or math or science. at the time ie the natural ordering
        //  suppose i want to sort with hindi

        //    you have ot return the +1,-1,0 b.z compareTo will return this only
        // compare is the static method in Integer wrapper class

       // return  Integer.compare(this.science ,s.getScience());// ascending
        return  Integer.compare(s.getScience(),this.science);// descending

    }*/


    //3.
    //for comparable<T> interface ,for only maths
    @Override
    public int compareTo(Student s) {

        //  student class has compareTo ie it can compare only one of its field
        //   either hindi or math or science. at the time ie the natural ordering
        //  suppose i want to sort with hindi

        //    you have ot return the +1,-1,0 b.z compareTo will return this only
        // compare is the static method in Integer wrapper class

       // return  Integer.compare(this.maths,s.getMaths());// ascending
        return  Integer.compare(s.getMaths(),this.maths);// descending


    }





}
