import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.wordle.Game;
import org.wordle.RandomWord;

import java.io.FileNotFoundException;

import static org.mockito.Mockito.when;


class WordTest {

@Mock
RandomWord randomWord;


        @Test
        public void myMockedClass() throws FileNotFoundException {
            RandomWord mockRandomWord = Mockito.mock(RandomWord.class);

            when(mockRandomWord.RandomWordMethod()).thenReturn("VOICE");
            Game testGame = new Game(mockRandomWord);
            testGame.runGame();


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


