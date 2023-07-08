package book;
import book.Book;

public class PrintMyBook extends Book {


    PrintMyBook(String name,String author,int price){
        super(name,author,price);
    }
    @Override
  String getDetails(){
        return this.getName()+" "+this.getAuthor()+" "+this.getPrice();
    }
}
