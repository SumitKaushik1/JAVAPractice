package book;

public class Test {

    public static void main(String [] args){
        Book b= new PrintMyBook("Harry Potter","J.K.Rowling",120);
        System.out.println(b.getDetails());
    }
}
