package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void iteration(int[] arr1) {
// Итерирование массива в консоль

        for (int i = 0; i < arr1.length; i++){  // Цикл for
            int ars = arr1[i];
            System.out.print(ars + " ");
        }
        System.out.println();

        for (int bok : arr1){                  // Цикл foreach
            System.out.print(bok + " ");
        }
        System.out.println();

        int p = 0;                             // Цикл while
        while (p < arr1.length){
            int from = arr1[p];
            p++;
            System.out.print(from + " ");
        }
        System.out.println();

        int a = 0;                            // Цикл do...while
        do {
            int ask = arr1[a];
            System.out.print(ask + " ");
            a++;
        }while (a < arr1.length);
        System.out.println();
        }

// Вывод каждого второго массива в консоль
        public static void twoElements(int[] arr2){

            for (int i = 0; i < arr2.length;){  // Цикл for
                if (i % 2 != 0){
                int ars = arr2[i];
                System.out.print(ars + " ");
                }else{
                    System.out.print("  ");
                }
                i++;
            }
            System.out.println();

            for (int bok : arr2){                  // Цикл foreach в данной задачи не возможно применить, так как у него нет возможности взаимодействовать с номерами ячеек.
                System.out.print(bok + " ");
            }
            System.out.println();

            int p = 0;                             // Цикл while
            while (p < arr2.length){
                if (p % 2 != 0) {
                    int from = arr2[p];
                    System.out.print(from + " ");
                }else{
                    System.out.print("  ");
                }
                p++;
            }
            System.out.println();


            int a = 0;                            // Цикл do...while
            do {
                int ask = arr2[a];
                if (a % 2 != 0) {
                    System.out.print(ask + " ");
                }else{
                    System.out.print("  ");
                }
                    a++;
                }while (a < arr2.length) ;
            System.out.println();
        }

 // Вывод всех элементов массива в консоль в обратном порядке.
    public static void revers(int[] arr3) {

        for (int i = arr3.length - 1; i >= 0; i--){  // Цикл for
            int ars = arr3[i];
            System.out.print(ars + " ");
        }
        System.out.println();

        for (int bok : arr3){                  // Цикл foreach в данной задачи не возможно применить, так как у него нет возможности взаимодействовать с номерами ячеек.
            System.out.print(bok + " ");
        }
        System.out.println();

        int p = arr3.length - 1;                             // Цикл while
        while (p >= 0){
            int from = arr3[p];
            p--;
            System.out.print(from + " ");
        }
        System.out.println();

        int a = arr3.length - 1;                            // Цикл do...while
        do {
            int ask = arr3[a];
            System.out.print(ask + " ");
            a--;
        }while (a >= 0);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arrays = ArraysUtils.arrayFromConsole();
        ArraysIteration.iteration(arrays);
        ArraysIteration.twoElements(arrays);
        ArraysIteration.revers(arrays);
    }
}


