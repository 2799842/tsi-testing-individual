package org.wordle;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        RandomWord randomWord = new RandomWord();
        new Game(randomWord);
        Game.runGame();

    }
}