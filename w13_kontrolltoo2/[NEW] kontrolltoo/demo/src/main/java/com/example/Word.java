package com.example;

import java.util.Scanner;

public class Word implements WordInterface {

    String lowercaseUserWord;
    char lowercaseUserLetter = 0;

    public Word(String lowercaseUserWord, char lowercaseUserLetter) {
        this.lowercaseUserWord = lowercaseUserWord;
        this.lowercaseUserLetter = lowercaseUserLetter;
    }

    @Override
    public int interfaceMethod() {
        Scanner scanner = new Scanner(System.in);
        int letterCount = 0;
        int i = 0;

        if(lowercaseUserWord == null && lowercaseUserLetter == 0){
            System.out.print("Enter random WORD: ");
            lowercaseUserWord = scanner.nextLine().toLowerCase();
            System.out.print("Enter random letter to check from previously entered word: ");
            char userLetter = scanner.next().charAt(0);
            lowercaseUserLetter = Character.toLowerCase(userLetter);
        }
        
        // Exception in thread "main" java.util.NoSuchElementException: No line found
        //scanner.close();

        for(i = 0; i < lowercaseUserWord.length(); i++){
            if(lowercaseUserWord.charAt(i) == lowercaseUserLetter){
                letterCount = letterCount + 1;
            }
        }
        System.out.println("---------------------------------------------------------------");
        System.out.print("Word " + lowercaseUserWord.toUpperCase() + " contains following amount of '" + lowercaseUserLetter + "' letters: ");
        return letterCount;
    }
}

