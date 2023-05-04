package org.wordle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomWord {

    public static String RandomWordMethod () throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();
        String randomWord;
        Random random = new Random();

        Scanner scanner = new Scanner(new File("C:\\Users\\Apprentice\\Documents\\Paul_McCann_Individual_Testing_Project\\src\\main\\java\\org\\wordle\\Word_Bank.txt"));
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        scanner.close();

        int index = random.nextInt(words.size());
        randomWord = words.get(index);
        return randomWord;
    }
}
