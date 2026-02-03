package Lesson03.DotOperator;

// Movie.java
public class Movie {
    String title;
    String genre;
    int rating;
    int year;

    void playIt() {

        System.out.println("Playing the movie: " + title + " (" + genre + ") from " + year + "- Rating: " + rating);
    }
}