package day31_Constructors.PracticeTasks.MovieTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    //TASK:
    /*
    Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

     */
    public String country, title, Gene, releaseDate, director;
    public ArrayList<String> casts;

    public Movie(String country, String title, String gene, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        Gene = gene;
        this.releaseDate = releaseDate;
        this.director = director;
        this.casts = new ArrayList<>();
    }

    public void addCast(String name){
        casts.add(name);
    }

    public void addCasts(String[] names){
        casts.addAll(Arrays.asList(names));
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Gene='" + Gene + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts=" + casts.size() +
                '}';
    }
}
