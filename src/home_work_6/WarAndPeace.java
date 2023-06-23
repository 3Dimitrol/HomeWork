package home_work_6;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class WarAndPeace {

    /**
     * Метод показывает кол-во уникальных слов в файле;
     * @param txt - передоваемый файл;
     * @return - возвращает кол-во уникальных слов;
     */
    public int fileWords(File txt) {

        File file = txt;

        Set<String> words = new HashSet<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String letters = scanner.next().replaceAll("[^а-яА-Я]", "");
                if (!letters.isEmpty()) {
                    words.add(letters);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
        System.out.println("Найдено " + words.size() + " уникальных слов");
        return words.size();
    }


    /**
     * Метод применяется для того, что бы показать какие слова (X1) используются чаще всего;
     * @param txt - передоваемый файл;
     * @param x1  - Кол-во слов, которые используются чаще всего;
     */
    public void fileMeaning(File txt, int x1) {

        File file = txt;

        Map<String, Integer> wordMap = new HashMap<>();

        try {
            Scanner scaner = new Scanner(file);

            StringBuilder line = new StringBuilder();
            while (scaner.hasNextLine()) {
                line.append(scaner.hasNextLine()).append("\n");
                String[] words = line.toString().split(" ");
                for (String word : words) {
                    if (!("".equals(word) || "--".equals(word) || " ".equals(word))) {
                        if (wordMap.containsKey(word)) {
                            int counter = wordMap.get(word);
                            wordMap.put(word, counter + 1);
                        } else {
                            wordMap.put(word, 1);
                        }
                    }
                }
                line = new StringBuilder(scaner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Map.Entry<String, Integer>> sorte = new ArrayList<>(wordMap.entrySet());
        sorte.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));


        for (int i = 0; i < x1; i++) {
            System.out.println(sorte.get(i).getKey() + ": " + sorte.get(i).getValue());
        }
    }


    public static void main(String[] args) {
        // Поиск кол-ва слов без учета регистра
        EasySearch countWord = new EasySearch();
        WarAndPeace data = new WarAndPeace();
        File buch = new File("WarAndPeace.txt");
        String text = data.stroka(buch);

        System.out.println(countWord.search(text, " война"));
        System.out.println(countWord.search(text, " и "));
        System.out.println(countWord.search(text, " мир"));

    }


    /**
     * Метод создан для чтения файла и перевода его в строку
     * @param txt - передоваемый файл
     * @return - возвращзает строку из файла
     */
    public String stroka(File txt) {

        StringBuilder line = new StringBuilder();

        try {
            Scanner scaner = new Scanner(txt);

            while (scaner.hasNextLine()) {
                    line.append(scaner.nextLine()).append("\n");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line.toString();
    }

}


