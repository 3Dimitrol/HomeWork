package test.home_work_2.loops_test;

import home_work_2.loops.Work_h_15;
import home_work_2.loops.Work_h_16;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work_h_16Test {


    @Test
    public void test161(){

        int x1 = 1;
        int x2 = 10;
        int x3 = 5;
        int x4 = 9;
        boolean number = x3 < x4;
        boolean number2 = x1 <= x2;
        Assertions.assertEquals(true, number);
        Assertions.assertEquals(true, number2);
    }


    @Test
    public void test162(){

        int x3 = 5;
        int x4 = 9;
        boolean number = x3 > 0 && x4 > 0;
        Assertions.assertEquals(true, number);
    }
}
