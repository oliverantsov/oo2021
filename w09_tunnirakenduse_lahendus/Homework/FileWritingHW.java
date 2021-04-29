import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * FileWritingHW
 */
public class FileWritingHW {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("student_data_processed.txt"));

        Files.readAllLines(Paths.get("student_data.txt"))
            .stream()
            .map(e -> e.split(","))
            .filter(e -> Integer.parseInt(e[1]) >= 3)
            .map(e -> "STUDENT NAME: " + e[0] + " --- CLASSES ATTENDED: " + e[2] + " --- FINAL GRADE: " + e[1])
            .forEach(e -> pw.println(e));
        pw.close();
    }
}