package AbstractProject;

public class Book extends Product {
    private String author;

    public Book(){}

    public Book(String name, Double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public Double discount(double dis) {
        Double price = getPrice();
        return price - price*(dis/100);
    }

    public void bookInfo(){
        System.out.println("Book Name: " +getName()+"\n"+"Book Price: "+ getPrice() +"\n"+"Author: "+getAuthor());
    }
}



