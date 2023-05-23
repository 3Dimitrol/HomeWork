package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work4_5BranchingOperatorTest {


    /**
     * Метод преднозначен для определения символа, по его коду из таблиы ASCII
     * @param x1 - Код-число символа
     * @return - символ;
     */
    public static char sim(int x1) { // x1 = 75;

        int number = x1; // Код-число, которое вводит пользователь

        return (char)number;
    }


    /**
     * Проверяется введенное значение, входит ли оно в номера символов таблици ASCII
     * a - номер символа по таблице ASCII
     */
    @Test
    public void aSCII(){
        int a = sim(75);
        char b = (char)a;
        Assertions.assertEquals('K', b);
    }


    /**
     * Проверяется введенное значение, входит ли оно в номера символов таблици ASCII
     * a - номер символа по таблице ASCII
     */
    @Test
    public void aSCIII(){
        int a = sim(75);
        boolean max = a >= 32 && a <= 127;
        Assertions.assertEquals(true, max);

    }
}
