package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        ArrayList<Movie> imdbBestMovies = new ArrayList<>();
        String filePath = "src/labs_examples/input_output/files/movies.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                imdbBestMovies.add(mapValuesToMovieObject(values));
            }
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        } catch (IOException exc) {
            exc.printStackTrace();
        }

        for (Movie movie : imdbBestMovies) {
            System.out.println(movie.toString());
        }

        try (FileWriter fw = new FileWriter("src/labs_examples/input_output/files/movies_new.csv")) {
            for (Movie movie : imdbBestMovies) {
                fw.write(movie.toString());
                fw.write("\n");
            }
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    public static Movie mapValuesToMovieObject(String[] values) {
        Movie movie = new Movie();

        movie.setTitle(values[0]);
        movie.setDirector(values[1]);
        movie.setYear(Integer.parseInt(values[2]));
        movie.setLength(Integer.parseInt(values[3]));
        movie.setImdbRating((Double.parseDouble(values[4])));

        return movie;
    }
}