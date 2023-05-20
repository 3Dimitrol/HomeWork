package home_work_1;

// Буква или иной символ

public class Work4_5BranchingOperator {
    public static void main(String[] args) {

        int number = 75; // Код-число, которое вводит пользователь

        if ((number >= 32) && (number <= 126)) { // Проверяем, есть ли в таблице символ который ввел пользователь

            if ((number <= 90) && (65 <= number)) { // Проверка на большую, английскую букву в верхнем регистре
                System.out.println("Это буква английского алфавита в верхнем регистре");
                System.out.println("Свой символ вы можете найти в таблице ASCII");
            } else if ((number <= 122) && (97 <= number)) { // Проверка на большую, английскую букву в нижнем регистре
                System.out.println("Это буква английского алфавита в нижнем регистре");
                System.out.println("Свой символ вы можете найти в таблице ASCII");
            } else if ((number >= 48) && (number <= 57)) { // Проверка на цифры
                System.out.println("Введенный код означает цифру");
                System.out.println("Свой символ вы можете найти в таблице ASCII");
            } else if ((number >= 32) || (number <= 126)) { // Проверка на символ
                System.out.println("Я хз что это, но это какой-то спец символ");
                System.out.println("Свой символ вы можете найти в таблице ASCII");
            } else {
            }
        } else {
            System.out.println("Данного кода нет в таблице и его значение не известно!");
        }
    }
}
