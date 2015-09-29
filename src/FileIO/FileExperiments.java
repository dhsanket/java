package FileIO;

/**
 * Created by sdeshpande on 29/09/2015.
 */

//http://www.vogella.com/tutorials/JavaIO/article.html

import java.io.IOException;
import java.nio.file.Files;
import java.io.File;
import java.nio.file.Paths;
import java.util.List;

public class FileExperiments {


    String fileName = "SomeFileName";
    public String readFile(String fileName) throws IOException{
        String content = new String(Files.readAllBytes(Paths.get(fileName)));
        return content;
    }

    public List readFileLines(String fileName) throws IOException{
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        return lines;
    }


    public List readFileLinesFilter(String fileName) throws IOException {
        //read all lines and remove whitespace (trim)
        //filter empty lines
        //and print result to System.out

        Files.lines(new File("input.txt").toPath())
                .map(s -> s.trim())
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);
    }

}
