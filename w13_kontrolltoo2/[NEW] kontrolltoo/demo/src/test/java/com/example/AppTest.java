package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
    static Word word;
    static Sentence sentence;

    @Test
    public void testPereLetterA(){
        var wordFile = new Word("pere", 'a');
        var letterCount = wordFile.interfaceMethod();
        assertEquals(0, letterCount);
    }

    @Test
    public void checkPereLetterP(){
        var wordFile = new Word("pere", 'p');
        var letterCount = wordFile.interfaceMethod();
        assertEquals(1, letterCount);
    }

    @Test
    public void checkPereLetterE(){
        var wordFile = new Word("pere", 'e');
        var letterCount = wordFile.interfaceMethod();
        assertEquals(2, letterCount);
    }

    @Test
    public void checkUserSentenceLetterACount(){
        var sentenceFile = new Sentence("aias sadas saia");
        var letterCount = sentenceFile.interfaceMethod();
        assertEquals(6, letterCount);
    }

}
