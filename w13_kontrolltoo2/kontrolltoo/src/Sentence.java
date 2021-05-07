import java.util.Scanner;

public class Sentence implements WordInterface {
    int wordCount;


    @Override
    public int getLetterCount() {
        Scanner scanner = new Scanner(System.in);
        char letterA = 'a';
        int letterACountInWord = 0;
        int letterACountInSentence = 0;
        int i = 0;

        System.out.print("Enter random sentence: ");
        String lowerCaseUserSentence = scanner.nextLine().toLowerCase();

        // Exception in thread "main" java.util.NoSuchElementException: No line found
        //scanner.close();

        String[] wordsInSentence = lowerCaseUserSentence.split(" ");

        for(String word : wordsInSentence){
            //System.out.print(word + " ");
            if(word.charAt(i) == letterA){
                letterACountInWord = letterACountInWord + 1;
            }
        }

        for(i = 0; i < lowerCaseUserSentence.length(); i++){
            if(lowerCaseUserSentence.charAt(i) == letterA){
                letterACountInSentence = letterACountInSentence + 1;
            }
        }

        
        System.out.println();
        System.out.print("Your randomly entered sentence contains following amount of 'a' letters: ");
        return letterACountInSentence;


    }

}
