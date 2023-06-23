package home_work_6;



public class EasySearch implements ISearchEngine{

    /**
     * метод используется для того, что бы узнать сколько раз, в тексте, встречается конкретное слово;
     * @param text - Параметром является текст в котором будут искать слово;
     * @param word - Параметром является искомое слово;
     * @return - возвращает, сколько раз встретилось конкретное слово;
     */
    public long search(String text, String word) {
        int count = 0;
        int i = 0;

        String chistka = text.toLowerCase().replaceAll("[^а-я А-Я 0-9]", " ");  // Добавил эту строку так как метод читал слова частично
        String wordPlus =" " + (word.replaceAll("[^а-яА-Я]", "")) + " "; // Добавил эту строку так как метод читал слова частично

        while (i >= 0) {
            i = chistka.indexOf(wordPlus, i);

            if (i >= 0) {
                count++;
                i++;
            }
        }
        return count;
    }
}

