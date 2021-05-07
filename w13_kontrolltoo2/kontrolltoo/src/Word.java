import java.util.Scanner;

public class Word implements WordInterface {
    Scanner scanner = new Scanner(System.in);

    @Override
    public int getLetterCount() {
        int letterCount = 0;
        int i = 0;
        for(i = 0; i < word.length; i++){
            letterCount = letterCount + 1;
        }
        return letterCount;
    }
    
}
