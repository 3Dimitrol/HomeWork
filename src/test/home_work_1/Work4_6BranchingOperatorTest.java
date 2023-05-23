package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work4_6BranchingOperatorTest {

    /**
     * Метод определяет является ли год высокосным
     * @param x1 - год который нужно проверить
     * @return - true - год высокосный, false - год не высокосный
     */
    public static boolean year(int x1) {

        int year = x1; // 2004

        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }


    /**
     * Проверяем является ли 2004 год высокосным
     */
    @Test
    public void test1(){
        boolean result = year(2004);
        Assertions.assertEquals(true, result);
    }
}
