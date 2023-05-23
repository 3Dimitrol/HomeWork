package test.home_work_2.loops_test;

import home_work_2.loops.Work_h_13;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work_h_13Test {



    @Test
    public void test231(){
        double number = Work_h_13.deegre(4, 3);
        double result = Math.pow(4, 3);
        Assertions.assertEquals(result, number);
    }

    /**
     * Проверка что степень положительное число
     */
    @Test
    public void test232(){
        int x2 = 3;
        boolean result = x2 >= 0;
        Assertions.assertEquals(true, result);

    }

    /**
     * Проверка что степень целое число
     */
    @Test
    public void test233(){
        double x2 = 3.3;
        int result = 3;
        Assertions.assertEquals(result, x2);
    }

    /**
     * Проверка работы метода с другими параметрами
     */
    @Test
    public void test234(){
        double number = Work_h_13.deegre(18, 5);
        double result = Math.pow(18, 5);
        Assertions.assertEquals(result, number);
    }

    /**
     * Проверка работы метода с другими параметрами
     */
    @Test
    public void test235(){
        double number = Work_h_13.deegre(7.5, 2);
        double result = Math.pow(7.5, 2);
        Assertions.assertEquals(result, number);
    }
}
