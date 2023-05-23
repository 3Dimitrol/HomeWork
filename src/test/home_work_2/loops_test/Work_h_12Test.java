package test.home_work_2.loops_test;

import home_work_2.loops.Work_h_12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work_h_12Test {


    /**
     * Проверка работы метода
     */
    @Test
    public void test221(){

        long number = Work_h_12.mylt("1459753");
        long result = 18_900;
        Assertions.assertEquals(result, number);
    }


    /**
     * Проверка типа вводных данных
     * number1 - Значение передонное в метод   "Hello!";
     * number2 - Значение которое ожидаем передать "1459753";
     */
    @Test
    public void test222(){
        String number1 = "Hello!";
        String number2 = "1459753";
        Assertions.assertEquals(number2, number1);
    }


    /**
     * Проверка что введенное значение не десятичное
     * number1 - Значение передонное в метод  "145975.3";
     * number2 - Значение которое ожидаем передать  "1459753";
     */
    @Test
    public void test223(){
        String number1 = "145975.3";
        String number2 = "1459753";
        Assertions.assertEquals(number2, number1);
    }
}
