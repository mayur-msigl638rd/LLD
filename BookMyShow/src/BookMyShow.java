import java.util.*;
import java.io.*;

public class BookMyShow {
	ArrayList<Theatre>theaters;
	static HashMap<String, ArrayList<Show>>movieMap;
	
	private void generateMovieMap()
	{
		for(Theatre theater : theaters)
		{
			ArrayList<Show> showArray = theater.getShows();
			for(Show show :showArray)
			{
				if(show!=null)
				{
					if(movieMap.containsKey(show.getMovie().getName()))
					{
						movieMap.get(show.getMovie().getName(),movieShowList);
						
					}
				}
			}
		}
	}
	public BookMyShow(ArrayList<Theatre> theaters) {
        this.theaters = theaters;
        this.movieMap = new HashMap<>();
        generateMovieMap();
        System.out.println(movieMap);
    }
    public static ArrayList<Show> searchShows(String movieName){
        if (movieMap.containsKey(movieName)){
            return movieMap.get(movieName);
        }
        else
            return null;
    }
public static void main(String args[])
{
	  GuestUser piyush = new GuestUser("Piyush");
m'uumma
      // Creating Registered User --> Ayush
      RegisteredUser ayush = new RegisteredUser("Ayush");

      // Creating Registered User --> Saurabh
      RegisteredUser saurabh = new RegisteredUser("Saurabh");

      // Creating Movie object --> Iron Man
      Movie ironMan = new Movie("Iron Man", Language.ENGLISH,Genre.ACTION);

      // Creating Movie object --> Avengers: End Game
      Movie avengers = new Movie("Avengers: End Game", Language.ENGLISH,Genre.ACTION);

      // Creating Movie object --> The Walk To Remember
      Movie walkToRemember = new Movie("The Walk To Remember", Language.ENGLISH,Genre.ROMANCE);

      // Creating Movie object --> HouseFull2
      Movie housefull = new Movie("HouseFull 2", Language.HINDI,Genre.COMEDY);
}
}
