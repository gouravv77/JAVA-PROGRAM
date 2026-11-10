import java.util.*;
class Movie {
String title;
String director;
String actors;
ArrayList<String> reviews = new ArrayList<>();
 void addReview(String review) {
  reviews.add(review);
 }
void getReviews() {
 System.out.println("Reviews:");
 for (String review : reviews) {
 System.out.println(review);
    }
    }
    }

public class Ass804 {
public static void main(String[] args) {
        Movie movie = new Movie();

        movie.title = "3 Idiots";
        movie.director = "Rajkumar Hirani";
        movie.actors = "Aamir Khan, R. Madhavan, Sharman Joshi";

        movie.addReview("Excellent movie");
        movie.addReview("Very inspiring");

        System.out.println("Title: " + movie.title);
        System.out.println("Director: " + movie.director);
        System.out.println("Actors: " + movie.actors);
        movie.getReviews();
    }
   }
