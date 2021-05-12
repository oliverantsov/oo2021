import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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



        

        try {

            FileWriter fw = new FileWriter("words.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            FileInputStream fs = new FileInputStream("words.txt");
            BufferedReader br = new BufferedReader(new java.io.InputStreamReader(fs));

            for(int z = 0; z < wordsInSentence.length; z++){
                pw.println(wordsInSentence[z]);
            }
            pw.close();

            String txtLine = br.readLine();
            while(txtLine != null){
                txtLine = br.readLine();
                
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error - file doesn't exist!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Input/output error!");
        }
        





        System.out.println("-----------------------------------------------------");
        System.out.println("SENTENCE contains following amount of 'a' letters: " + letterACountInSentence);
        return "Sentence.java -> COMPLETED!";

    }

}
