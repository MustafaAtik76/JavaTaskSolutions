package Tasks.Old;

import Tasks.Old.Movie;

public class test1 {

    public static void main(String[] args) {

      /*  1. create an object of the movie:
        title: Journey to SDET: Cydeo Batch 25
        country: USA
        Genre: Adventure, Comedy, Thriller
        release date: 10/25/2021
        director: Kuzzat Altay
        Casts: Asiya, Adam, Muhtar and 5 more students from your group*/

        Movie movie = new Movie("USA", "Journey to SDET: Cydeo Batch 25", "10/25/2021", "Kuzzat Altay");

        String [] array= {"Asiye", "Adam", "Asiye", "Adam","Asiye", "Adam","Asiye", "Adam"};
        movie.addCast(array);
        movie.addCast(movie.director);

        System.out.println(movie);


    }
}
