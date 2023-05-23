package home_work_2.loops;

public class Work_h_11 {
    public static long add(String x1) { // x1 = "8";

        int jou = Integer.parseInt(x1);  //Переводим String в int
        if (jou > 20 || jou < 0){             //Проверяем, корректное ли число ввели через аргумент
            return jou;

        } else {
            long moon = 1; // Создаем переменную, в которую будет собрано произведение всех чисел
            for (long i = 1; i <= jou; i++) {
                moon = moon * i;
                if (i < jou) {
                    System.out.print(i + " * ");
                }

            }
            return moon;
        }
    }
}
