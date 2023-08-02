package AbstractProject;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("How To Be Success",300.0,"Mohamad");
        b1.bookInfo();
        System.out.println("Book Price after 10% Discount: "+ b1.discount(10));
        System.out.println("--------------------------------------");
        Book b2 = new Book("5 Ways to Success",200.0,"Khalid");
        b2.bookInfo();
        System.out.println("Book Price after 10% Discount: "+ b2.discount(10));
        System.out.println("--------------------------------------");
        Movie m1 = new Movie("The Founder",500.0,"Jon");
        m1.movieInfo();
        System.out.println("Movie price after 20% Discount: "+m1.discount(20));
        System.out.println("--------------------------------------");
        Movie m2 = new Movie("Black List",400.0,"Josiph");
        m2.movieInfo();
        System.out.println("Movie price after 5% Discount: "+m2.discount(5));
    }
}
