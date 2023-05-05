package homework1;

// Нахождение случайного числа, в определенном промежутке, при помощи класса Math.random

public class Work3_1_ClassMath {
    public static int numberRon(int min, int max) {

        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static void main(String[] args){
        int a = -128;
        int b = 127;
        System.out.println(Work3_1_ClassMath.numberRon(a, b));

    }
}

