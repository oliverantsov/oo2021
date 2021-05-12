import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Sentence implements WordInterface {

    @Override
    public String interfaceMethod() {
        Scanner scanner = new Scanner(System.in);
        char letterA = 'a';
        int letterACountInSentence = 0;
        int wordCount = 0;

        System.out.print("Enter random sentence: ");
        String lowerCaseUserSentence = scanner.nextLine().toLowerCase();

        // Exception in thread "main" java.util.NoSuchElementException: No line found
        //scanner.close();

        String[] wordsInSentence = lowerCaseUserSentence.split(" ");


        for(String word : wordsInSentence){
            //System.out.println(Arrays.toString(wordsInSentence));
            wordCount = wordCount + 1;
        }

        System.out.println("------------------------------");
        System.out.println("WORDS in entered sentence: " + wordCount);
        System.out.println("------------------------------");

        for(int x = 0; x < wordsInSentence.length; x++){
            int letterACountInWord = 0;
            String singleWord = wordsInSentence[x];
            for(int y = 0; y < singleWord.length(); y++){
                if(singleWord.charAt(y) == letterA){
                    letterACountInWord = letterACountInWord + 1;
                }
            }
            System.out.println("WORD " + (x + 1) + " 'a' count: " + letterACountInWord);
        }

        for(int i = 0; i < lowerCaseUserSentence.length(); i++){
            if(lowerCaseUserSentence.charAt(i) == letterA){
                letterACountInSentence = letterACountInSentence + 1;
            }
        }



        File output = new File("words.txt");
        try {
            PrintWriter pw = new PrintWriter(output);
            for(int z = 0; z < wordsInSentence.length; z++){

                pw.println(wordsInSentence[z]);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error because file doesn't exist!");
        }

        



        System.out.println("-----------------------------------------------------");
        System.out.print("SENTENCE contains following amount of 'a' letters: " + letterACountInSentence);
        return "Sentence.java -> COMPLETED!";

    }

}