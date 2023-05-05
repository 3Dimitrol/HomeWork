package homework2.loops;

import java.util.Arrays;
import java.util.Random;

public class Work_h_15 {

    //Найти наибольшую цифру натурального числа
    public static int[] work_h_1_5_1(int number){
        int[] num = {number};
        String b = String.valueOf(number);
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            int r = Integer.parseInt(String.valueOf(c));
            if (r == 9) {
                System.out.println("Наибольшая натуральная цифра : 9");
                return num;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            int r = Integer.parseInt(String.valueOf(c));
            if (r == 8) {
                System.out.println("Наибольшая натуральная цифра : 8");
                return num;
            }
        }
        for (int q = 0; q < b.length(); q++) {
            char z = b.charAt(q);
            int r = Integer.parseInt(String.valueOf(z));
            if (r == 7) {
                System.out.println("Наибольшая натуральная цифра : 7");
                return num;
            }
        }
        for (int q = 0; q < b.length(); q++) {
            char z = b.charAt(q);
            int r = Integer.parseInt(String.valueOf(z));
            if (r == 6) {
                System.out.println("Наибольшая натуральная цифра : 6");
                return num;
            }
        }
        for (int q = 0; q < b.length(); q++) {
            char z = b.charAt(q);
            int r = Integer.parseInt(String.valueOf(z));
            if (r == 5) {
                System.out.println("Наибольшая натуральная цифра : 5");
                return num;
            }
        }
        for (int q = 0; q < b.length(); q++) {
            char z = b.charAt(q);
            int r = Integer.parseInt(String.valueOf(z));
            if (r == 4) {
                System.out.println("Наибольшая натуральная цифра : 4");
                return num;
            }
        }
        for (int q = 0; q < b.length(); q++) {
            char z = b.charAt(q);
            int r = Integer.parseInt(String.valueOf(z));
            if (r == 3) {
                System.out.println("Наибольшая натуральная цифра : 3");
                return num;
            }
        }
        for (int q = 0; q < b.length(); q++) {
            char z = b.charAt(q);
            int r = Integer.parseInt(String.valueOf(z));
            if (r == 2) {
                System.out.println("Наибольшая натуральная цифра : 2");
                return num;
            }
        }
        for (int q = 0; q < b.length(); q++) {
            char z = b.charAt(q);
            int r = Integer.parseInt(String.valueOf(z));
            if (r == 1) {
                System.out.println("Наибольшая натуральная цифра : 1");
                return num;
            }
        }
        for (int q = 0; q < b.length(); q++) {
            char z = b.charAt(q);
            int r = Integer.parseInt(String.valueOf(z));
            if (r == 0) {
                System.out.println("Наибольшая натуральная цифра : 0");
                return num;
            } else {
                System.out.println("Введите положительное число");
            }
        } return num;
    }

    //Вероятность четных случайных чисел
    public static int[] work_h_1_5_2(){
        Random rand = new Random();
        int j = 0;  int k = 0;
        double y = 1000;
        for (int i = 0; i <= y; i++) {

            int a = rand.nextInt(100);
            if (a % 2 == 0){
                j++;
            }else{
                k++;
            }
        }
        int[] moon = {j, k};

        if (j > k){
            double mass1 = (j * 100)/y;
            System.out.println("Вероятность четных чисел больше : " + mass1 + " %");
        } else {
            double mass2 = (k * 100)/y;
            System.out.println("Вероятность нечетных чисел больше : " + mass2 + " %");
        }
        return moon;
    }
    //Посчитать четные и нечетные цифры числа
    public static int [] work_h_1_5_3(int number){
        int even = 0;  int odd = 0;
        for(int i = number; i > 0;){
            if (i % 2 == 0){
                i = i / 10;
                even++;
            }else {
                i = i / 10;
                odd++;
            }
        }
        System.out.println("Количество четных чисел : " + even + " ");
        System.out.println("Количество нечетных чисел : " + odd + " ");
        return new int[]{number};
    }

    //Ряд Фибоначчи
    public static int[] work_h_1_5_4(int quantity){
        int[] o = {quantity};
        int first = 1;
        int second = 2;
        System.out.print(first + " " + second + " ");
        for(int i = 3; i <= quantity; i++){
            System.out.print(first + second + " ");
            int b = first;
            first = second;
            second = b + first;
        }
        System.out.println();
        return o;
    }

    //Вывести ряд чисел в диапазоне с шагом
    public static double[] work_h_1_5_5(double min, double max, double shag){
        double mini = min;
        if (min < max){


            for (;mini < max;){
                System.out.print(mini + " ");
                mini = mini + shag;

            }
        } else {
            System.out.println("Вы ввели неверное значение, начните сначало и введите : минимум, максимум и шаг");
        }
        System.out.println();
        return new double[]{min, max, shag};
    }

    //Переворот числа
    public static int[] work_h_1_5_6(int number){
        int fog = number;
        int dofog = fog;
        for (int i = 0; 0 < fog;){
            dofog = fog % 10;
            System.out.print(dofog + " ");
            fog = fog / 10;
        }
        System.out.println();
        return new int[]{number};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Work_h_15.work_h_1_5_1(24629457)));
        System.out.println(Arrays.toString(Work_h_15.work_h_1_5_2()));
        System.out.println(Arrays.toString(Work_h_15.work_h_1_5_3(635732)));
        System.out.println(Arrays.toString(Work_h_15.work_h_1_5_4(9)));
        System.out.println((Arrays.toString(Work_h_15.work_h_1_5_5(4, 18, 2))));
        System.out.println(Arrays.toString(Work_h_15.work_h_1_5_6(1351775)));

    }
}
