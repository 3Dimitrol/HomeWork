package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work4_2BranchingOperatorTest {


    /**
     * Проверяем, нет ли среди введённых чисел - одинаковых
     * a - Число введенное пользоваетлем
     * b - Число введенное пользоваетлем
     * c - Число введенное пользоваетлем
     */
    @Test
    public void identicalNumbers(){
        int a = 67;
        int b = 76;
        int c = 63;

        boolean act = a == b && b == c && c == a;
        boolean ex = false;
        Assertions.assertEquals(ex, act);

    }
}

