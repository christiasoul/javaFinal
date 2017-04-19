package movies;


public class MovieStorage{
    private String movieName;
    private String maleActor;
    private String femaleActress;
    private String [] genres;

    public MovieStorage(String setName, String mAct, String fAct, String [] setGenres){
        movieName = setName;
        maleActor = mAct;
        femaleActress = fAct;
        genres = setGenres;
    }

    public String getName(){  return movieName;   }
    public String getMActor(){  return maleActor;   }
    public String getFActress(){  return femaleActress;   }
    public String [] getGenres(){   return genres;  }

    public String getString(){
        String flatGenres = "";
        for (int i = 0; i < genres.length; i++){
            flatGenres = flatGenres + ", " + genres[i];
        }
        
        return "Movie Name : " + movieName + " Male Actor : " + maleActor + "  Female Actor : "
            + femaleActress + "  Genres : " + flatGenres;
    }

}