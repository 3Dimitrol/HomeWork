package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class Work_h_2_4 {
    // Сумма четных положительных элементов массива
    public static void positiveElements(int[] arr1) {
        int[] ork = new int[arr1.length];


        System.out.print("Заданный массив : ");
        for (int bok : arr1) {
            System.out.print(bok + " ");
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            int base = arr1[i];
            if (base % 2 == 0) {
                ork[i] = base;
            }
        }
        int num = 0;
        for (int j = 0; j < ork.length; j++) {
            num = num + ork[j];
        }
        if (num == 0) {
            System.out.print("В заданном массиве, нет четных чисел. Сумаа равна 0");
            return;
        }
        System.out.print("Сумма четных положительных элементов массива = " + num);
        System.out.println();
    }

    // Максимальный элемент массива с четным индексом
    public static void maxElement(int[] arr2) {
        int[] ork = new int[arr2.length];


        System.out.print("Заданный массив : ");
        for (int bok : arr2) {
            System.out.print(bok + " ");
        }
        System.out.println();


        System.out.print("Элементы массива с четным индексом : ");
        for (int i = 0; i < arr2.length; ) {
            if (i % 2 != 0) {
                int ars = arr2[i];
                ork[i] = arr2[i];
                System.out.print(ars + " ");
            } else {
                System.out.print("  ");
            }
            i++;
        }
        System.out.println();

        int pol = ork[1];
        for (int i = 1; i < ork.length; i++) {
            if (pol < ork[i]) {
                pol = ork[i];
            }
        }
        System.out.print("Максимальный элемент массива с четным индексом : " + pol);
        System.out.println();
    }
    // Элементы массива, которые меньше среднего арифметического
    public static void med(int[] arr3) {

            System.out.print("Заданный массив : ");
        for (int bok : arr3) {
            System.out.print(bok + " ");
        }
        System.out.println();

        int a = arr3[0];
        for (int i = 1; i < arr3.length; i++) {
            a = a + arr3[i];
        }
        int medium = a / arr3.length;
        System.out.println("Средне арифметическое значение массива = " + medium);

        System.out.print("Элементы массива, значение которых, меньше среднего арифметического значения массива : ");
        for (int i = 0; i < arr3.length; i++) {
            if (medium > arr3[i]) {
                System.out.print(arr3[i] + " ");
            }

        }
        System.out.println();
    }

    //Найти два наименьших (минимальных) элемента массива
    public static void min_min(int[] arr4) {

        System.out.print("Заданный массив : ");
        for (int bok : arr4) {
            System.out.print(bok + " ");
        }
        System.out.println();

        int min1 = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (min1 > arr4[i]) {
                min1 = arr4[i];
            } else {

            }

        }
        int min2 = arr4[1];
        for (int i = 0; i < arr4.length; i++) {
            if (min1 == arr4[i]) {
            } else if (min2 > arr4[i]) {
                min2 = arr4[i];
            } else {

            }

        }
        System.out.println("Первый минимальный символ : " + min1);
        System.out.println("Второй минимальный символ : " + min2);
    }

    //Сжать массив, удалив элементы, принадлежащие интервалу
    public static void compression(int[] arr5) {
        Scanner ram = new Scanner(System.in);
        System.out.print("Введите интервал чисел : \nОт : ");
        int ot = ram.nextInt();
        System.out.print("До : ");
        int doo = ram.nextInt();

        int[] ork = new int[arr5.length];

        System.out.print("Заданный массив : ");
        for (int bok : arr5) {
            System.out.print(bok + " ");
        }
        System.out.println();

        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] >= ot && arr5[i] <= doo) {
                arr5[i] = 0;
            }
        }
        System.out.print("Массив без чисел из интервала : ");
        for (int bok : arr5) {
            System.out.print(bok + " ");
        }
        System.out.println();

        int j = 0;
        for (int i = 0; i < arr5.length; i++) {
            if(arr5[i] > 0){
                ork[j] = arr5[i];
                j++;
            }
        }
        System.out.print("Отредактированный массив : ");
        for (int bok : ork) {
            System.out.print(bok + " ");
        }
        System.out.println();
    }

   //Сумма цифр массива
    public static void amount(int[] arr6) {

        System.out.print("Заданный массив : ");
        for (int bok : arr6) {
            System.out.print(bok + " ");
        }
        System.out.println();

        int first = 0;
        for (int i = 0; i < arr6.length; i++){
            int second = arr6[i];
            while (second > 0){
                int del = second % 10;
                first = first + del;
                second = second / 10;
            }

        }
        System.out.print("Сумма чисел массива = " + first);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arrays = ArraysUtils.arrayRandom(50, 100);
        Work_h_2_4.positiveElements(arrays);
        Work_h_2_4.maxElement(arrays);
        Work_h_2_4.med(arrays);
        Work_h_2_4.min_min(arrays);
        Work_h_2_4.amount(arrays);
        Work_h_2_4.compression(arrays);


    }
}

