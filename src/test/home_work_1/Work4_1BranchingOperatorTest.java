package test.home_work_1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work4_1BranchingOperatorTest {


    /**
     * Проверяем вписывается ли введённое число поле int
     * a - число введенное пользователем
     */
    @Test
        public void inntNumber1(){
        int a = 15;
        boolean expected = (-2_147_483_648 <= a) && (2_147_483_647 >= a);
        boolean actual = (-2_147_483_648 <= a) && (2_147_483_647 >= a);
            Assertions.assertEquals(expected,actual);

    }


    /**
     * Проверяем вписывается ли введённое число поле int
     * b - число введенное пользователем
     */
            @Test
            public void inntNumber2() {
                int b = 28;
                boolean expected2 = (-2_147_483_648 <= b) && (2_147_483_647 >= b);
                boolean actual2 = (-2_147_483_648 <= b) && (2_147_483_647 >= b);
                Assertions.assertEquals(expected2, actual2);
    }

}

