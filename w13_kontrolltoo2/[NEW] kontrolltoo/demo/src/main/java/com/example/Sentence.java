package com.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class Sentence implements WordInterface {

    String lowerCaseUserSentence;

    public Sentence(String lowerCaseUserSentence) {
        this.lowerCaseUserSentence = lowerCaseUserSentence;
    }

    @Override
    public int interfaceMethod() {
        Scanner scanner = new Scanner(System.in);
        char letterA = 'a';
        int letterACountInSentence = 0;
        int wordCount = 0;

        if(lowerCaseUserSentence == null ){
            System.out.print("Enter random sentence: ");
            lowerCaseUserSentence = scanner.nextLine().toLowerCase();
        }

        // Exception in thread "main" java.util.NoSuchElementException: No line found
        //scanner.close();

        String[] wordsInSentence = lowerCaseUserSentence.split(" ");


        for(String word : wordsInSentence){
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

            ArrayList<String> uniqueWords = new ArrayList<String>();
            ArrayList<String> notUniqueWords = new ArrayList<String>();
            ArrayList<String> fileWords = new ArrayList<String>();

            //String[] wordsInSentence = lowerCaseUserSentence.split(" ");

            String txtLine = br.readLine();

            while(txtLine != null){
                fileWords.add(txtLine);
                txtLine = br.readLine();
            }

            for(int x = 0; x < wordsInSentence.length; x++){
                for(int y = 0; y < fileWords.size(); y++){
                    if(wordsInSentence[x].equals(fileWords.get(y))){
                        notUniqueWords.add(wordsInSentence[x]);
                        break;
                    } else if (y == (fileWords.size() - 1)){
                        uniqueWords.add(wordsInSentence[x]);
                    }
                }
            }

            for(int z = 0; z < uniqueWords.size(); z++){
                pw.println(uniqueWords.get(z));
            }

            pw.close();
            br.close();

            System.out.println("New words from SENTENCE: " + uniqueWords);
            System.out.println("Already assigned words from SENTENCE: " + notUniqueWords);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error - file doesn't exist!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Input/output error!");
        }
        


        System.out.println("-----------------------------------------------------");
        System.out.print("SENTENCE contains following amount of 'a' letters: ");
        return letterACountInSentence;
    }
}

