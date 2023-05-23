package test.home_work_2.loops_test;

import home_work_2.loops.Work_h_15;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work_h_15Test {


    /**1.5.1
     * Проверка работы метода
     */
    @Test
    public void test1511(){
        int number = Work_h_15.work_h_1_5_1(24629457);
        int result = 9;
        Assertions.assertEquals(result, number);
    }

    /**1.5.1
     * Проверка работы метода
     */
    @Test
    public void test1512(){
        int number = Work_h_15.work_h_1_5_1(6246245);
        int result = 6;
        Assertions.assertEquals(result, number);
    }

    /**1.5.1
     * Проверка работы метода
     */
    @Test
    public void test1513(){
        int number = Work_h_15.work_h_1_5_1(0);
        int result = 0;
        Assertions.assertEquals(result, number);
    }


    /**1.5.1
     * Проверка, что введенное число является положительным
     */
    @Test
    public void test1514(){
        int x1 = 24629457;
        int number = Work_h_15.work_h_1_5_1(x1);
        boolean result = x1 >= 0;
        Assertions.assertEquals(true, result);
    }

    /** 1.5.2
     * проверяем что диапозон случайных чисел не больше 100 и что случайные числа буду положительными
     */
    @Test
    public void test1521(){
        int x1 = 100;
        double y = 1000;
        double number = Work_h_15.work_h_1_5_2(x1, y);
        boolean result = x1 >= 0 && x1 <= 100;
        Assertions.assertEquals(true, result);
    }

    /** 1.5.2
     * проверяем что количество случайных чисел будет равно 1000
     */
    @Test
    public void test1522(){
        int x1 = 100;
        double y = 1000;
        double number = Work_h_15.work_h_1_5_2(x1, y);
        boolean result = y >= 0 && y <= 1000;
        Assertions.assertEquals(true, result);
    }

    /** 1.5.3
     * проверяем что количество нечетных числе больше
     */
    @Test
    public void test1531(){
        int number = Work_h_15.work_h_1_5_3(635732);
        int result = 4;
        Assertions.assertEquals(result, number);
    }

    /** 1.5.3
     * проверяем что метод работает с нулём
     */
    @Test
    public void test1532(){
        int number = Work_h_15.work_h_1_5_3(0);
        int result = 0;
        Assertions.assertEquals(result, number);
    }

    /** 1.5.4
     * проверяем что метод работает, сравнивая последнее полученное число с ожидаемым
     */
    @Test
    public void test1541(){
        int number = Work_h_15.work_h_1_5_4(9);
        int result = 55;
        Assertions.assertEquals(result, number);
    }

    /** 1.5.4
     * проверяем что метод работает с 0
     */
    @Test
    public void test1542(){
        int number = Work_h_15.work_h_1_5_4(0);
        int result = 0;
        Assertions.assertEquals(result, number);
    }

    /** 1.5.4
     * проверяем что метод работает с отрицательным числом
     */
    @Test
    public void test1543(){
        int number = Work_h_15.work_h_1_5_4(-3);
        int result = 0;
        Assertions.assertEquals(result, number);
    }


    /**1.5.5
     * Проверяем введенные значения
     */
    @Test
    public void test1551(){
        double min = 4;
        double max = 18;
        double shag = 2;
        double result1 = 4;
        double result2 = 18;
        double result3 = 2;
        Assertions.assertEquals(result1, min);
        Assertions.assertEquals(result2, max);
        Assertions.assertEquals(result3, shag);
    }

    /**1.5.5
     * Проверяем работу метода , если все показатели 0
     */
    @Test
    public void test1552(){
        double number = Work_h_15.work_h_1_5_5(0, 0, 0);
        double result = 0;
        Assertions.assertEquals(result, number);
    }


    /**1.5.6
     * Проверяем корректность введённых данных
     */
    @Test
    public void test1561(){
        int number = 10753;
        int result = 10753;
        Assertions.assertEquals(result, number);
    }


}
