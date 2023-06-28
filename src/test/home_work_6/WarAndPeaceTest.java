package test.home_work_6;


import home_work_6.WarAndPeace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;


public class WarAndPeaceTest {

    @Test
    public void testWord(){
        WarAndPeace word = new WarAndPeace();
        File buch = new File("Test.txt");

        Assertions.assertEquals(19, word.fileWords(buch));
    }

    @Test
    public void testMeaning(){
        WarAndPeace word = new WarAndPeace();
        File buch = new File("WarAndPeace.txt");

        word.fileMeaning(buch, 5);
    }

    @Test
    public void testText(){
        WarAndPeace word = new WarAndPeace();
        File buch = new File("Test.txt");

        System.out.println(word.stroka(buch));
    }
}

