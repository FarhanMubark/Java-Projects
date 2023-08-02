package AbstractProject;

public class Movie extends Product {
    private String director;

    public Movie(){}

    public Movie(String name, Double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public Double discount(double dis) {
        Double price = getPrice();
        return price - price*(dis/100);
    }

    public void movieInfo(){
        System.out.println("Director Name: "+director+ "\n"+"Movie Name: "+getName()+"\n"+"Movie Price: "+getPrice());
    }
}
