package home_work_7;

import home_work_6.ISearchEngine;

public class SearchEnginePunctuationNormalizer  implements ISearchEngine {

    private ISearchEngine searchEasy;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEasy = searchEngine;
    }

    /**
     * Метод удаляет все ненужные знаки препинания, символы, а так же двойные пробелы
     * @param text - текст который нужно почистить
     * @return - вернуть чистый текст
     */
    private String normalText(String text) {

        String chistka = text.replaceAll("[^a-zA-Zа-яА-Я\\s]", "").replaceAll("\\s+", " ");
        return chistka;
    }

    /**
     * Метод должен возвращать, сколько раз встретилось слово в тексте
     * @param text  -  текст в котором ведется поиск
     * @param word  -  слово, которое ищем
     * @return  -  вернуть сколько раз встретилось слово
     */
    public long search(String text, String word) {
        String normalText = normalText(text);
        return searchEasy.search(normalText, word);
    }
}
