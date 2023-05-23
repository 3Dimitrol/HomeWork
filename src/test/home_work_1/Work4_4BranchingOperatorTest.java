package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work4_4BranchingOperatorTest {


    /**
     * Метод преднозначен для перевода числа из байтов в килобайты и наоборот
     * @param sim - значение в которое хотим перевести число
     * @param x1 - число которое хотим перевести
     * @return - переведённое значение
     */
    public double bytKbyt(String sim, int x1){ // sim = " k ", x1 = 10
        double number = x1; // Значение вводимое пользователем
        String name = sim; // Переводная еденица, выбронная пользователем

        if (name.equalsIgnoreCase("k")) {
            double action = number / 1024;
            return action;

        }else if (name.equalsIgnoreCase("b")) {
            double action = number * 1024;
            return action;
        }
        return 0;
    }


    /**
     * Проверяем как перевелось из килобайты в байты
     */
    @Test
    public void translation1(){

        double trsl = bytKbyt("b", 10);
        double result = 10240;
        Assertions.assertEquals(result, trsl);

    }


    /**
     * Проверяем как перевелось из байты в уилобайты
     */
    @Test
    public void translation2(){

        double trsl = bytKbyt("k", 10);
        double result = 0.009765625;
        Assertions.assertEquals(result, trsl);

    }



}
