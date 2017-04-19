import movies.*;
import java.util.ArrayList;
import movies.FilterMovies;



public class FilterTest{
    public static void main(String [] args){
        ArrayList<movies.MovieStorage> movieList = movies.FileUtils.readFileWithScanner();
        FilterMovies theFilter = new FilterMovies();
        theFilter.
        FilterMovies.FilterType [] typeAr = {
            movies.FilterMovies.FilterType.MaleActor,
            movies.FilterMovies.FilterType.Name,
            movies.FilterMovies.FilterType.Name
        };

        ArrayList<movies.MovieStorage> filterList = movies.FilterMovies.filter(movieList,
            typeAr, compAr, strInput);
    }
}