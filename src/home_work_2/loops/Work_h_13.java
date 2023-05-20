package home_work_2.loops;

import java.util.Scanner;

public class Work_h_13 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Введите число, которое необходимо возвести в степень : ");
        double digit = number.nextDouble();
        System.out.print("Введите целое число - степень: ");
        int degree = number.nextInt();

        if(degree > 0) {
            double oup = digit;
            for (int i = 1; i < degree; i++) {
                digit = digit * oup;

            }
            System.out.println(oup + " ^ " + degree + " = " + digit);
        } else {
            System.out.println("Степень должна быть положительной.\nНачните сначало и введите положительное чилсо.");
        }
    }
}
