package test.home_work_6;

import home_work_6.EasySearch;
import home_work_6.WarAndPeace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class EasySearchTest {

    @Test
    public void testEasySearch(){
        WarAndPeace text = new WarAndPeace();
        EasySearch word = new EasySearch();
        File buch = new File("Test.txt");

        System.out.println(word.search(text.stroka(buch), "привет"));
        Assertions.assertEquals(7, word.search(text.stroka(buch), "привет"));
    }

    @Test
    public void testIEasySearch(){
        WarAndPeace text = new WarAndPeace();
        EasySearch word = new EasySearch();
        File buch = new File("Test.txt");

        String stroka = text.stroka(buch);
        System.out.println(word.search(stroka, "мыл"));
        Assertions.assertEquals(1,word.search(stroka, "---мыл-"));
        System.out.println(word.search(stroka, "порт"));
        Assertions.assertEquals(0,word.search(stroka, "порт"));
        System.out.println(word.search(stroka, "дом"));
        Assertions.assertEquals(0,word.search(stroka, "дом"));
        System.out.println(word.search(stroka, "бабуш"));
        Assertions.assertEquals(0,word.search(stroka, "бабуш"));
        System.out.println(word.search(stroka, "и"));
        Assertions.assertEquals(1,word.search(stroka, "и"));


    }
}
