package test.home_work_7;

import home_work_7.RegExSearch;
import home_work_6.WarAndPeace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class RegExSearchTest {

    @Test
    public void testRegExSearch(){
        RegExSearch reg = new RegExSearch();
        WarAndPeace wap = new WarAndPeace();
        File buch = new File("WarAndPeace.txt");
        File text = new File("Test.txt");

        System.out.println(reg.search(wap.stroka(buch), "мир"));
        System.out.println(reg.search(wap.stroka(buch), "война"));
        System.out.println(reg.search(wap.stroka(buch), "и"));
        Assertions.assertEquals(6, reg.search(wap.stroka(text), "привет"));
        System.out.println(reg.search(wap.stroka(text), "мыл"));
    }
}
