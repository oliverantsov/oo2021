import java.util.Scanner;

public class Word implements WordInterface {

    @Override
    public int getLetterCount() {
        Scanner scanner = new Scanner(System.in);
        int letterCount = 0;
        int i = 0;

        System.out.println("Enter random word: ");
        String userWord = scanner.nextLine();
        System.out.println("Enter random letter to check from previously entered word: ");
        char userLetter = scanner.next().charAt(0);
        
        for(userLetter = 'a'; userLetter <= 'ü'; userLetter++){
            for(i = 0; i < userWord.length(); i++){

                letterCount = letterCount + 1;
            }
        }
        
        return letterCount;

    }
}
