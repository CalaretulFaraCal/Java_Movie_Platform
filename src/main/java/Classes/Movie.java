package Classes;

import java.util.ArrayList;

public class Movie {
    private String title;
    private int releaseYear;
    private String genre;
    private ArrayList<Double> ratings;

    public Movie(String title, int releaseYear, String genre, ArrayList<Double> ratings) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.ratings = ratings;
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public int getReleaseYear() {return releaseYear;}
    public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;}

    public String getGenre() {return genre;}
    public void setGenre(String genre) {this.genre = genre;}

    public ArrayList<Double> getRatings() {return ratings;}
    public void addRating(double rating){
        if(rating >=1 && rating <= 10) ratings.add(rating);
        else System.out.println("Invalid rating");
    }

}
