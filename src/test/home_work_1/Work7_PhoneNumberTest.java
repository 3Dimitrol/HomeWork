package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work7_PhoneNumberTest {

    /**
     * Метод фарматирует содержимое массива
     * @param number - передается массив
     * @return - выражение правильного формата
     */
    public static String createPhoneNumber(String[] number){  //String[] call  = {"4", "4", "4", "3", "5", "3", "9", "8", "9", "2"};

        return "(" + number[0] + number[1] + number[2] + ") " + number[3] + number[4] + number[5] + "-" + number[6] + number[7] + number[8] + number[9];
    }


    @Test
    public void cart1(){
        String[] call  = {"4", "4", "4", "3", "5", "3", "9", "8", "9", "2"};
        String call1  = createPhoneNumber(call);
        String result = "(444) 353-9892";
        Assertions.assertEquals(result,call1);
    }

    @Test
    public void cart2(){
        String[] call  =  {"7", "4", "3", "3", "2", "3", "0", "8", "0", "2"};;
        String call1  = createPhoneNumber(call);
        String result = "(743) 323-0802";
        Assertions.assertEquals(result,call1);
    }

}
