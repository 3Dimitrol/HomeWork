package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work5_StaticMethodTest {

    /**
     * Метод проверяет нужно ли нам сегодня на работу
     * @param weekday - параметр обозначающий рабочий день
     * @param vacation - параметр обозначающий отпуск или не рабочий день
     * @return - true: у вас отпуск, false: сегодня рабочий день
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }



    @Test
    public void test1(){
        boolean day = sleepIn(true, false);
        Assertions.assertEquals(false, day);
    }
}
