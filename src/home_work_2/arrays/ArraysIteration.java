package home_work_2.arrays;

import home_work_3.calcs.api.IArraysOperation;

public class ArraysIteration implements IArraysOperation {
    public int[] iterationFor(int[] arr1) {
// Итерирование массива в консоль


        for (int i = 0; i < arr1.length; i++) {  // Цикл for
            int ars = arr1[i];
            System.out.print(ars + " ");
        }
        System.out.println();
        return arr1;
    }
        public int[] iterationForeach(int[] arr1) {

            for (int bok : arr1) {                  // Цикл foreach
                System.out.print(bok + " ");
            }
            System.out.println();
            return arr1;
        }
            public int[] iterationWhile(int[] arr1){

                int p = 0;                             // Цикл while
                while (p < arr1.length) {
                    int from = arr1[p];
                    p++;
                    System.out.print(from + " ");
                }
                System.out.println();
                return arr1;
            }

    public int[] iterationDoWhile(int[] arr1){
        int a = 0;                            // Цикл do...while
        do {
            int ask = arr1[a];
            System.out.print(ask + " ");
            a++;
        }while (a < arr1.length);
        System.out.println();
        return arr1;
    }

// Вывод каждого второго массива в консоль
        public int[] twoElementsFor(int[] arr2) {

            int[] aaa = new int[arr2.length];
            for (int i = 0; i < arr2.length; ) {  // Цикл for
                if (i % 2 != 0) {
                    int ars = arr2[i];
                    System.out.print(ars + " ");
                    aaa[i] = ars;
                } else {
                    System.out.print("  ");
                }
                i++;
            }
            System.out.println();
            return aaa;
        }

            public int[] twoElementsForeach(int[] arr2){

                for (int bok : arr2) {                  // Цикл foreach в данной задачи не возможно применить, так как у него нет возможности взаимодействовать с номерами ячеек.
                    System.out.print(bok + " ");
                }
                System.out.println();
                return arr2;
            }

    public int[] twoElementsWhile(int[] arr2) {
        int p = 0;          // Цикл while
        int [] aaaa = new int[arr2.length];
        while (p < arr2.length) {
            if (p % 2 != 0) {
                int from = arr2[p];
                System.out.print(from + " ");
                aaaa [p] = from;
            } else {
                System.out.print("  ");
            }
            p++;
        }
        System.out.println();
        return aaaa;
    }

    public int[] twoElementsDoWhile(int[] arr2){
            int a = 0;       // Цикл do...while
        int[] aarr = new int[arr2.length];
            do {
                int ask = arr2[a];
                if (a % 2 != 0) {
                    System.out.print(ask + " ");
                    aarr [a] = ask;
                }else{
                    System.out.print("  ");
                }
                    a++;
                }while (a < arr2.length);
            System.out.println();
        return aarr;
    }

 // Вывод всех элементов массива в консоль в обратном порядке.
    public int[] reversFor(int[] arr3) {


        int[] aaa = new int[arr3.length];

        for (int i = arr3.length - 1; i >= 0; i--) {  // Цикл for
            int ars = arr3[i];
            System.out.print(ars + " ");
            aaa[arr3.length - ars] = ars;
        }
        System.out.println();
        return aaa;
    }

        public int[] reversForeach(int[] arr3) {

            for (int bok : arr3) {                  // Цикл foreach в данной задачи не возможно применить, так как у него нет возможности взаимодействовать с номерами ячеек.
                System.out.print(bok + " ");
            }
            System.out.println();
            return arr3;
        }

    public int[] reversWhile(int[] arr3) {
        int[] aaa = new int[arr3.length];
        int p = arr3.length - 1;                             // Цикл while
        while (p >= 0) {
            int from = arr3[p];
            aaa[(arr3.length - 1) - p] = from;
            p--;
            System.out.print(from + " ");

        }
        System.out.println();
        return aaa;
    }

    public int[] reversDoWhile(int[] arr3) {
        int a = arr3.length - 1;       // Цикл do...while
        int [] arrra = new int[arr3.length];
        do {
            int ask = arr3[a];
            System.out.print(ask + " ");
            arrra[(arr3.length - 1) - a] = ask;
            a--;
        }while (a >= 0);
        System.out.println();
        return arrra;
    }

 /*   public static void main(String[] args) {
        int[] arrays = ArraysUtils.arrayFromConsole();
        ArraysIteration.iteration(arrays);
        ArraysIteration.twoElements(arrays);
        ArraysIteration.revers(arrays);
    }*/
}


