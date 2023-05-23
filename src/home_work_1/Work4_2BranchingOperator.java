package home_work_1;

// Среди всех чисел надо найти среднее


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work4_2BranchingOperator {
    public static void main(String[] args) {

        int a = 67; // Данные вводимые пользователем
        int b = 78; // Данные вводимые пользователем
        int c = 87; // Данные вводимые пользователем

        if (a == b && b == c) {
            System.out.println("Все числа равны, сам выбирай среднее число"); // Проверка всех данных, на равенство

        } else if (b == c) {
            System.out.println("Два символова равны, задача не имеет смысла, зачем ты так?"); // Проверка данных, на равенство

        } else if (a == b) {
            System.out.println("Два символова равны, задача не имеет смысла, зачем ты так?"); // Проверка данных, на равенство

        } else if ((a < b && a > c) || (a < c && a > b)) {
            System.out.println("a = " + a + " среднее число"); // Сравнение переменной a с остальными переменными

        } else if ((b < a && b > c) || (b > a && b < c)) {
            System.out.println("b = " + b + " среднее число"); // Сравнение переменной b с остальными переменными

        } else if ((c < a && c > b) || (c < b && c > a)) {
            System.out.println("c = " + c + " среднее число"); // Сравнение переменной c с остальными переменными

        } else {
            System.out.println("Ну и что ты хочешь от меня после этого?"); // Итог, к которому приходим, если пользователь обманул программу
        }
    }
}


