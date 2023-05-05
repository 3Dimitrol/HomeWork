package homework2.sorts;

import homework2.utils.ArraysUtils;
import homework2.utils.SortsUtils;
import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] work1 = new int[]{1,2,3,4,5,6};
        System.out.println("Заданный массив : " + Arrays.toString(work1));
        SortsUtils.sort(work1);
        System.out.println("Массив после сортировки прямым обменом : " + Arrays.toString(work1));

        int[] work12 = new int[]{1,2,3,4,5,6};
        SortsUtils.shake(work12);
        System.out.println("Массив после шейкер-сортировка : " + Arrays.toString(work12));

        System.out.println();


        int[] work2 = new int[]{1,1,1,1};
        System.out.println("Заданный массив : " + Arrays.toString(work2));
        SortsUtils.sort(work2);
        System.out.println("Массив после сортировки прямым обменом : " + Arrays.toString(work2));

        int[] work22 = new int[]{1,1,1,1};
        SortsUtils.sort(work22);
        System.out.println("Массив после шейкер-сортировка : " + Arrays.toString(work22));

        System.out.println();


        int[] work3 = new int[]{9,1,5,99,9,9};
        System.out.println("Заданный массив : " + Arrays.toString(work3));
        SortsUtils.sort(work3);
        System.out.println("Массив после сортировки прямым обменом : " + Arrays.toString(work3));

        int[] work32 = new int[]{9,1,5,99,9,9};
        SortsUtils.sort(work32);
        System.out.println("Массив после шейкер-сортировка : " + Arrays.toString(work32));

        System.out.println();


        int[] work4 = new int[]{};
        System.out.println("Заданный массив : " + Arrays.toString(work4));
        SortsUtils.sort(work4);
        System.out.println("Массив после сортировки прямым обменом : " + Arrays.toString(work4));

        int[] work42 = new int[]{};
        SortsUtils.sort(work42);
        System.out.println("Массив после шейкер-сортировка : " + Arrays.toString(work42));

        System.out.println();


        int[] work5 = new int[]{6,5,4,3,2,1};
        System.out.println("Заданный массив : " + Arrays.toString(work5));
        SortsUtils.sort(work5);
        System.out.println("Массив после сортировки прямым обменом : " + Arrays.toString(work5));

        int[] work52 = new int[]{6,5,4,3,2,1};
        SortsUtils.sort(work52);
        System.out.println("Массив после шейкер-сортировка : " + Arrays.toString(work52));

        System.out.println();


        int[] work6 = ArraysUtils.arrayRandom(50, 100);
        int[] work62 = work6;
        System.out.println("Заданный массив : " + Arrays.toString(work6));
        SortsUtils.sort(work6);
        System.out.println("Массив после сортировки прямым обменом : " + Arrays.toString(work6));
        SortsUtils.sort(work62);
        System.out.println("Массив после шейкер-сортировка : " + Arrays.toString(work62));

        System.out.println();



        int[] work7 = ArraysUtils.arrayFromConsole();
        int[] work72 = work7;
        System.out.println("Заданный массив : " + Arrays.toString(work7));
        SortsUtils.sort(work7);
        System.out.println("Массив после сортировки прямым обменом : " + Arrays.toString(work7));
        SortsUtils.sort(work72);
        System.out.println("Массив после шейкер-сортировка : " + Arrays.toString(work72));

        System.out.println();
    }
}
