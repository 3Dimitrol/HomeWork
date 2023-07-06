package test.home_work_7;

import home_work_6.EasySearch;
import home_work_6.ISearchEngine;
import home_work_6.WarAndPeace;
import home_work_7.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class SearchEnginePunctuationNormalizerTest {

    @Test
    public void testLizerTest(){

        ISearchEngine search = new EasySearch();
        ISearchEngine decorSearch = new SearchEnginePunctuationNormalizer(search);

        WarAndPeace buch = new WarAndPeace();
        File file = new File("WarAndPeace.txt");

        String text = buch.stroka(file);

        long count = decorSearch.search(text, "война");
        System.out.println(count);
        Assertions.assertEquals(51, count);

    }
}

