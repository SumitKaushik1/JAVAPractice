package book;

public  abstract class Book {
    private String  name;
    private String author;
    private int price;

    Book(String name,String author,int price){
        this.name=name;
        this.author=author;
        this.price=price;
    }


    abstract String getDetails();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
