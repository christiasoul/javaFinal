package movies;
import java.util.ArrayList;

public class FilterMovies{
    public enum FilterType{Name, MaleActor, FemaleActor, Genre}
    public enum FilterComparison{Has, Is, Not}

    public static ArrayList<MovieStorage> filter(ArrayList<MovieStorage> movieData, FilterType [] typeAr, FilterComparison [] compAr, String strInput){
        ArrayList<MovieStorage> filterMovies = new ArrayList<MovieStorage>();
        for (int i = 0; i < movieData.size(); i++){
            MovieStorage tempMovie = movieData.get(i);
            boolean currentCheck = true;
            for (int j = 0; j < typeAr.length && currentCheck == true; j++){
                currentCheck = sortItem(tempMovie, typeAr[j], compAr[j], strInput);
            }
            if (currentCheck){
                filterMovies.add(tempMovie);
            }
        }

        return filterMovies;
    }

    public static boolean sortItem(MovieStorage movieIn, FilterType type, FilterComparison comp, String strInput){
        String [] movieString;

        // Get the string of what is going to be compared
        if (type == FilterType.Name){
            movieString = new String[1];
            movieString[0] = movieIn.getName();
        }else if (type == FilterType.MaleActor){
            movieString = new String[1];
            movieString[0] = movieIn.getMActor();
        }else if (type == FilterType.FemaleActor){
            movieString = new String[1];
            movieString[0] = movieIn.getFActress();
        }else{
            movieString = movieIn.getGenres();
        }


        // Compare them, using a for loop in case of comparing genre
        for (int i = 0; i < movieString.length; i++){

            if (comp == FilterComparison.Has){
                if( movieString[i].contains(strInput) ){
                    return true;
                }

            }else if (comp == FilterComparison.Is){
                if (movieString[i].contentEquals(strInput)){
                    return true;
                }
            }else if (comp == FilterComparison.Not){
                if (movieString[i].contains(strInput)){
                    return false;
                }
            }
        }

        if (comp == FilterComparison.Not){
            return true;
        }else{
            return false;
        }

    }



}

