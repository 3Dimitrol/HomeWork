package home_work_7;

import home_work_6.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    public long search(String text, String word) {


        String chistka = text.toLowerCase().replaceAll("[^а-я А-Я 0-9]", " ");
        String wordPlus =" " + (word.replaceAll("[^а-яА-Я]", "")) + " ";

        Pattern wordes = Pattern.compile(wordPlus);
        Matcher textes = wordes.matcher(chistka);

        int count = 0;
        while (textes.find()) {
            count++;
        }

        return count;
    }
}
