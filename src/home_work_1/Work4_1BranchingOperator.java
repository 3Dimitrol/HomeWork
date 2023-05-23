package home_work_1;

// Определить нечетное число

public class Work4_1BranchingOperator {
    public static void main(String[] args) {
        int a = 15; // Данные вводимые пользователем
        int b = 13; // Данные вводимые пользователем

        if ((a % 2) != 0)  {
            System.out.println(a + " - является нечетным числом");

            if ((b % 2) != 0) {
                System.out.println(b + " - является нечетным числом");
            } else {
                System.out.println(b + " - является четным числом");
            }
        } else if ((b % 2) != 0) {
            System.out.println(b + " - является нечетным числом");
            System.out.println(a + " - является четным числом");
        } else {
            System.out.println(a + " и " + b + " являются четными числами");
        }
    }
}

