import java.util.Scanner;

public class Word implements WordInterface {

    @Override
    public String interfaceMethod() {
        Scanner scanner = new Scanner(System.in);
        int letterCount = 0;
        int i = 0;

        System.out.print("Enter random WORD: ");
        String lowercaseUserWord = scanner.nextLine().toLowerCase();
        System.out.print("Enter random letter to check from previously entered word: ");
        char userLetter = scanner.next().charAt(0);
        char lowercaseUserLetter = Character.toLowerCase(userLetter);
        
        // Exception in thread "main" java.util.NoSuchElementException: No line found
        //scanner.close();

        for(i = 0; i < lowercaseUserWord.length(); i++){
            if(lowercaseUserWord.charAt(i) == lowercaseUserLetter){
                letterCount = letterCount + 1;
            }
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Word " + lowercaseUserWord.toUpperCase() + " contains following amount of '" + lowercaseUserLetter + "' letters: " + letterCount);
        return "Word.java -> COMPLETED!";
    }

}
