package Classes;

public class User {
    private double id;
    private String name;

    public User(double id, String name) {
        this.id = id;
        this.name = name;
    }

    public double getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public void rateMovie(double rating, Movie movie) {
        movie.addRating(rating);
        System.out.println(name + " rated " + movie.getTitle() + " with " + rating + " stars ");
    }
}
