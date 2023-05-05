package homework2.loops;

public class Work_h_11 {
    public static void main(String[] args) {

        int jou = Integer.parseInt(args[0]);  //Переводим String в int
        if (jou > 20 || jou < 0){             //Проверяем, корректное ли число ввели через аргумент
            System.out.print("Вы ввели некорректные данные. \nНачните сначала и введите число от 0 до 20 ");

        } else {
            long moon = 1; // Создаем переменную, в которую будет собрано произведение всех чисел
            for (long i = 1; i <= jou; i++) {
                moon = moon * i;
                if (i < jou) {
                    System.out.print(i + " * ");

                } else {
                    System.out.print(jou + " = " + moon);
                }
            }
        }
    }
}
