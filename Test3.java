import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable<Movie> {
    private String name;
    private double imdbRating;

    public Movie(String name, double imdbRating){
        this.name = name;
        this.imdbRating= imdbRating;
    }

    public String getName(){
        return name;
    }

    public double getImdbRating(){
        return imdbRating;
    }

    public int compareTo(Movie otherMovie){
        return Double.compare(otherMovie.imdbRating, this.imdbRating);
    }

    public String toString(){
        return "Rating: "+this.imdbRating+",Movie:  "+this.name;

    }

}

class MovieSorter{
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Inception", 8.6));
        movieList.add(new Movie("The Godfather", 9.0));
        movieList.add(new Movie("The Dark Knight", 8.9));
        movieList.add(new Movie("Fiction", 8.8));

        System.out.println("Unsorted List: ");
        for(Movie m : movieList){
            System.out.println(m);
        }

        Collections.sort(movieList);
        System.out.println("After sorted: ");

        for(Movie m : movieList){
            System.out.println(m);
        }

    }
}
