import java.util.Arrays;
import java.util.Scanner;

public class Sentence implements WordInterface {

    @Override
    public int getLetterCount() {
        Scanner scanner = new Scanner(System.in);
        char letterA = 'a';
        int letterACountInSentence = 0;
        int i = 0;
        int x = 0;
        int y = 0;
        int wordCount = 0;
        
        System.out.print("Enter random sentence: ");
        String lowerCaseUserSentence = scanner.nextLine().toLowerCase();

        // Exception in thread "main" java.util.NoSuchElementException: No line found
        //scanner.close();

        String[] wordsInSentence = lowerCaseUserSentence.split(" ");


        for(String word : wordsInSentence){
            //System.out.print(word + " ");
            //System.out.println(Arrays.toString(wordsInSentence));
            wordCount = wordCount + 1;
        }

        System.out.println("------------------------------");
        System.out.println("WORDS in entered sentence: " + wordCount);
        System.out.println("------------------------------");

        for(x = 0; x < wordsInSentence.length; x++){
            int letterACountInWord = 0;
            String singleWord = wordsInSentence[x];
            for(y = 0; y < singleWord.length(); y++){
                if(singleWord.charAt(y) == letterA){
                    letterACountInWord = letterACountInWord + 1;
                }
            }
            System.out.println("WORD " + (x + 1) + " 'a' count: " + letterACountInWord);
        }

// -----------------------------------------------------------------------
//                                  DONE
        for(i = 0; i < lowerCaseUserSentence.length(); i++){
            if(lowerCaseUserSentence.charAt(i) == letterA){
                letterACountInSentence = letterACountInSentence + 1;
            }
        }

        System.out.println("-----------------------------------------------------");
        System.out.print("SENTENCE contains following amount of 'a' letters: ");
        return letterACountInSentence;
// -----------------------------------------------------------------------
    }

    public String fileStuff(){
        return "Test";
    }
}
