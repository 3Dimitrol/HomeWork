package home_work_1;
// Побитовые операции
import java.util.Scanner; //пакет с которым я раньше не работал

public class Work1_1_BitwiseOperations {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in); // Создается объект Scanner
        System.out.print("Введите первое число: ");
        int firstNumber = enter.nextInt(); /* Записывается первое число введенное пользователем:
         * DEC 69
         * BIN 0100 0101
         */

        System.out.print("Введите второе число: ");
        int secondNumber = enter.nextInt(); /* Записывается второе число введенное пользователем
         * DEC 99
         * BIN 0110 0011
         */

        int and = firstNumber & secondNumber; // 69 & 99 - 0100 0101 & 0110 0011 = 0100 0001 - 65
        int or = firstNumber | secondNumber; // 69 | 99 - 0100 0101 & 0110 0011 = 0110 0111 - 103

        System.out.println( "Результатом первой операции является = " + and);
        System.out.println( "Результатом второй операции является = " + or);

    }
}
