package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole(){
        Scanner array = new Scanner(System.in);
        System.out.print("Введите размер массива : ");
        int goot = array.nextInt();
        int [] number = new int[goot];
        for (int i = 0; i < goot; i++) {
            System.out.print("Введите элемент массива : ");
            number[i] = array.nextInt();
        }
        return number;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] joy = new int[size];  // Создается массив
        Random fool = new Random();
        for (int i = 0; i < joy.length; i++){
        joy[i] = fool.nextInt(maxValueExclusion); // Заполнение массива случайными числами
        }
        return joy;
    }
}
