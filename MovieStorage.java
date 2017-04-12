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
    public String getFActor(){  return femaleActress;   }
    public String [] getGenres(){   return genres;  }

}