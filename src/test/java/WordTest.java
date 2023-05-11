import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.wordle.Documentation;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.wordle.RandomWord.RandomWordMethod;


public class WordTest {


    @Test
    public void mockRandomWord() {
        ArrayList<String> mockWords = new ArrayList<>(Arrays.asList("AAAAA", "BBBBB", "CCCCC", "DDDDD"));
        Random random = mock(Random.class);
        when(random.nextInt(mockWords.size())).thenReturn(2);

        Scanner test = mock(Scanner.class);
        when(test.hasNext()).thenReturn(true,true, false);
        when(test.next()).thenReturn(mockWords.get(0), mockWords.get(2));
    }


    @Test
    public void testMockWordNotNull() throws FileNotFoundException {

        String randomWord = RandomWordMethod();
        Assertions.assertNotNull(randomWord);
        Assertions.assertTrue(randomWord.length() > 0);
    }


    @Test
    public void testMockWordLessThanSix() throws FileNotFoundException {

        String randomWord = RandomWordMethod();
        Assertions.assertNotNull(randomWord);
        Assertions.assertTrue(randomWord.length() < 6);
    }

    @Test
    public void testContinueDocumentation(){
        Documentation continueDocumentation = new Documentation();
        continueDocumentation.Continue();
    }


    @Test
    public void testHelpDocumentation() {
        Documentation helpDocumentation = new Documentation();
        helpDocumentation.Help();
    }

    @Test
    public void testWelcomeDocumentation() {
        Documentation welcomeDocumentation = new Documentation();
        welcomeDocumentation.Welcome();
    }

}

