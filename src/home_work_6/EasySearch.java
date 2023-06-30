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

        while (i >= 0) {
            i = text.indexOf(word, i);

            if (i >= 0) {
                count++;
                i++;
            }
        }
        return count;
    }
}

