package org.wordle;

public class Documentation{

    public void Welcome(){
        System.out.println("Welcome To Wordle!");
        System.out.println("If you don't know how to play, type 'help' for instructions or press 'C' to continue");
    }

    public void Help() {
        System.out.println("You will have a total of 6 attempts to guess a 5 letter word");
        System.out.println("After each guess, a hint will be given, based on how close you were to guessing the word");
        System.out.println("A green outline indicates that the letter is in the correct place");
        System.out.println("A yellow outline indicates that the letter is in the word, but in the wrong place");
        System.out.println("A grey outline indicates that the letter is not in the word\n");
    }

    public void Continue(){
        System.out.println("Let's play Wordle!");
    }
}
