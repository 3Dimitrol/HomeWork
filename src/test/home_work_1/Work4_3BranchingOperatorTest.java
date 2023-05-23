package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work4_3BranchingOperatorTest {


    /**
     * Проверяем является ли первое число больше второго
     * numberFirst  - введенные значения
     * numberSecond - введенные значения
     */
    @Test
    public void secondNumber() {
            int numberFirst = 111;
            int numberSecond = 33;

            boolean number = numberFirst >= numberSecond;
            Assertions.assertEquals(true, number);
        }


}
