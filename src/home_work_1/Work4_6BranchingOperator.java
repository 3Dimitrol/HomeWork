package home_work_1;

// Проверка на высокосный год

public class Work4_6BranchingOperator {
    public static void main(String[] args) {

        int year = 2024; // Год который указывает пользователь

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) { // Условия, проверяющие, является ли год высокосным
            System.out.println( year + " год является высокосным");

        } else {
            System.out.println(year + " год является не высокосным");
        }
    }
}
