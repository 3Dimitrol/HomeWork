package home_work_2.loops;

import java.util.Scanner;

public class Work_h_13 {
    public static double deegre(double x1, int x2) {

      /*  Scanner number = new Scanner(System.in);
        System.out.print("Введите число, которое необходимо возвести в степень : ");

        System.out.print("Введите целое число - степень: "); */
        int degree = x2;
        double digit = x1;


            double oup = digit;
            for (int i = 1; i < degree; i++) {
                digit = digit * oup;

            }
            return digit;
    }
}
