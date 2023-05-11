import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.wordle.RandomWord;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class WordTest {


    @Test
    public void mockRandomWord() {
        ArrayList<String> mockWords = new ArrayList<>(Arrays.asList("AAAAA", "BBBBB", "CCCCC", "DDDDD"));
        Random random = mock(Random.class);
        when(random.nextInt(mockWords.size())).thenReturn(2);

        Scanner test = mock(Scanner.class);
        when(test.next()).thenReturn(mockWords.get(0), mockWords.get(2));
    }



    @Test
    public void testMockWordNotNull() throws FileNotFoundException {

        String randomWord = RandomWord.RandomWordMethod();
        Assertions.assertNotNull(randomWord);
        Assertions.assertTrue(randomWord.length() > 0);
    }


    @Test
    public void testMockWordLessThanSix() throws FileNotFoundException {

        String randomWord = RandomWord.RandomWordMethod();
        Assertions.assertNotNull(randomWord);
        Assertions.assertTrue(randomWord.length() < 6);
    }

}


