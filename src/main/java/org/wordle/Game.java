package org.wordle;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {
    public static Scanner scanner = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";

    RandomWord randomWord;

    public Game(RandomWord randomWord){
    this.randomWord = randomWord;

}
    public static void runGame() throws FileNotFoundException {

        Documentation documentation = new Documentation();

        int attempts = 1;

        documentation.Welcome();
        String response = scanner.nextLine();
        if (response.equals("help")) {
            documentation.Help();
        } else if (response.equals('c')) {
            documentation.Continue();
        }



        String givenRandomWord = RandomWord.RandomWordMethod();
        char[] answer = new char[5];
        for(int index = 0; index< 5;index++)
            answer[index]=givenRandomWord.charAt(index);
        char[] input = new char[5];
        boolean won = false;

        while(!won && attempts< 7)

        {
            System.out.print("Attempt Number : " + attempts + " Please enter in your guess: ");
            System.out.println();
            String guess = scanner.nextLine().toUpperCase();
            while (guess.length() < 5) {
                System.out.println("Please make sure your guess is 5 letters long");
                System.out.print("Attempt Number : " + attempts + " Please enter in your guess: ");
                guess = scanner.nextLine().toUpperCase();
            }
            for (int index = 0; index < 5; index++) {
                answer[index] = givenRandomWord.charAt(index);
                input[index] = guess.charAt(index);
            }
            if (includeYellowGreen(input, answer)) {
                won = true;
                System.out.println("You guessed the Word! Well Done");
            }
            attempts++;
        }
    }

    public static boolean includeYellowGreen ( char[] guessedWord, char[] correctWord){
        boolean correct = true;
        int[] letterColour = new int[5];

        //Green for correct letter, in correct place
        for (int index = 0; index < 5; index++) {
            if (guessedWord[index] == correctWord[index]) {
                correctWord[index] = ' ';
                letterColour[index] = 2;
            } else correct = false;
        }

        //Yellow for correct letter, in incorrect place
        for (int index = 0; index < 5; index++) {
            for (int j = 0; j < 5; j++) {
                if (guessedWord[index] == correctWord[j] && letterColour[index] != 2) {
                    letterColour[index] = 1;
                    correctWord[j] = ' ';
                }
            }
        }

        for (int index = 0; index < 5; index++) {
            if (letterColour[index] == 0) System.out.print(guessedWord[index]);
            if (letterColour[index] == 1) System.out.print(ANSI_YELLOW + guessedWord[index] + ANSI_RESET);
            if (letterColour[index] == 2) System.out.print(ANSI_GREEN + guessedWord[index] + ANSI_RESET);
        }
        System.out.println(" ");
        return correct;
    }
}


