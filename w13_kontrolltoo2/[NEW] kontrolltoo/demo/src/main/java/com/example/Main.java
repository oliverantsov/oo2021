package com.example;

public class Main {
    public static void main(String[] args) {

        Word word = new Word(null, (char) 0);
        System.out.println("-----------------------------------------------------");
        System.out.println(word.interfaceMethod());
        System.out.println("-----------------------------------------------------");
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("-----------------------------------------------------");
        Sentence sentence = new Sentence(null);
        System.out.println(sentence.interfaceMethod());
        System.out.println("-----------------------------------------------------");
        System.out.println("/////////////////////////////////////////////////////");
    }
}

