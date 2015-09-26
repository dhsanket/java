/**
 * Created with IntelliJ IDEA.
 * User: Sanks
 * Date: 07/04/2015
 * Time: started 18:27 jsonoutfromHardcodedUrls: 19:25pm, urlsFromFileSuccess: 21:13pm
 * To change this template use File | Settings | File Templates.
 */

import com.google.gson.Gson;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ImdbCrawler {
    public static void main (String[] args){

        crawlTopRatingMovies(args);

    }

    private static void crawlTopRatingMovies(String[] args) {
        System.out.print("Crawler started");
        System.out.print(System.getProperty("line.separator"));

        List<Movie> moviesList = new ArrayList<Movie>();
        ArrayList<String> urls = new ArrayList<String>();

        readUrlsFromFile(urls, args);


        for (int i=0; i<urls.size(); i++) {
            Document doc = null;
            try {
                doc = Jsoup.connect(urls.get(i)).get();
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            Movie movie = parseImdbToGetMovieDetails(doc);

            moviesList.add(movie);
        }


        Gson gson = new Gson();

        sortDecending(moviesList);

        moviesList = moviesList.subList(0,5);  // not efficient as processing all data before reducing size
        String json = gson.toJson(moviesList);

        System.out.print(json);

        try {
            PrintWriter writer = new PrintWriter(args[1]+"top5Movies.json", "UTF-8");
            writer.println(json);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private static Movie parseImdbToGetMovieDetails(Document doc) {
        String movieTitle = doc.select("#overview-top h1 span").get(0).text();
        String movieYear = doc.select("#overview-top h1 span a").text();
        String movieRating = doc.select(".star-box-giga-star").text();

        Movie movie = new Movie();
        movie.rating = Double.parseDouble(movieRating);
        movie.year = movieYear;
        movie.title = movieTitle;
        return movie;
    }

    private static void sortDecending(List<Movie> moviesList) {
        Collections.sort(moviesList, new Comparator<Movie>() {
            public int compare(Movie movie1, Movie movie2) {
                if (movie1.rating == movie2.rating)
                    return 0;
                return movie1.rating < movie2.rating ? 1 : -1;
            }
        });
    }

    private static void readUrlsFromFile(ArrayList<String> urls, String[] args) {
        String filePath = args[0];

        String aLine;
        BufferedReader lineReader;

        try {
            FileReader fr = new FileReader(filePath);
            lineReader = new BufferedReader(fr);

            try {
                while ( ( aLine = lineReader.readLine() ) != null ) {

                        urls.add(aLine);

                }
                lineReader.close();
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
