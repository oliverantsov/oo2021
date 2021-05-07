import java.util.Scanner;

public class Sentence implements WordInterface {
    int sonadeArvLauses;


    @Override
    public int getLetterCount() {
        Scanner scanner = new Scanner(System.in);
        char letterA = 'a';
        int letterACount = 0;
        int i = 0;

        System.out.print("Enter random sentence: ");
        String lowerCaseUserSentence = scanner.nextLine().toLowerCase();

        scanner.close();

        for(i = 0; i < lowerCaseUserSentence.length(); i++){
            if(lowerCaseUserSentence.charAt(i) == letterA){
                letterACount = letterACount + 1;
            }
        }

        System.out.println("Your randomly entered sentence contains following amount of 'a' letters: ");
        return letterACount;

        
    }

}
