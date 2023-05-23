package test.home_work_2.loops_test;

import home_work_2.loops.Work_h_11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work_h_11Test {


    /**
     * Проверка работы метода
     */
    @Test
    public void test211(){
        long x1 = Work_h_11.add("8");
        long result = 40_320;
        Assertions.assertEquals(result, x1);
    }


    /**
     * Проверяем не будет ли переполнения от введенного числа
     */
    @Test
    public void test212(){
        long number = 8;
        long max = 20;
        long min = 0;
        boolean predel = number > min && number < max;
        Assertions.assertEquals(true, predel);
    }

    /**
     * Проверка работы метода
     */
    @Test
    public void test213(){
        long x1 = Work_h_11.add("5");
        long result = 120;
        Assertions.assertEquals(result, x1);
    }



}
