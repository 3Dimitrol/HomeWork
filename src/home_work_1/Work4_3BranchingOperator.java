package home_work_1;

// Деление первого числа на второе

public class Work4_3BranchingOperator {
    public static void main(String[] args) {

        int number1 = 111; // Первое число введенное пользователем
        int number2 = 33; // Второе число введенное пользователем

        int division = number1 % number2; // Проверка остатка от деления

        if (number1 >= number2){
            if (division == 0) {
                int q = number1 / number2; // Частное
                System.out.println("Первое чилос делиться на второе без остатка " + '\n' + "Частное равно: " + q );

            } else if (division != 0) {
                int b = division; // Остаток
                int k = number1 / number2; // Частное
                System.out.println("Первое чилос делиться на второе с остатком " + '\n' + "Остаток равен: " + b + '\n' + "Частное равно: " + k);

            } else {
                System.out.println("Как ты сюда попал?");
            }

        } else {
            int y = number2 % number1; // Так как первое чилос меньше второго, то переменные меняются местами
            int l = number2 / number1; // Частное
            int h = number1 / number2;
            System.out.println("Первое число больше второго, ответ будет некорректным (частное первого числа к второму = " + h + "), переменные меняются местами:" + '\n' + "Остаток равен: " + y + '\n' + "Частное равно: " + l);
        }
    }

}
