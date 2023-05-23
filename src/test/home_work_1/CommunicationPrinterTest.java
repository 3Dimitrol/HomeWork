package test.home_work_1;

import home_work_1.Work6_1_NameUser;
import home_work_1.Work6_2_NameUser;
import home_work_1.Work6_3_NameUser;
import home_work_3.calcs.api.ICommunicationPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommunicationPrinterTest {

    @Test
    public void name(){

        ICommunicationPrinter nameOld = new Work6_2_NameUser();

        String name1 = nameOld.welcome("Вася");
        String result = "Привет! \nЯ тебя так долго ждал";
        Assertions.assertEquals(result, name1);
    }


    @Test
    public void name2(){

        ICommunicationPrinter nameOld = new Work6_1_NameUser();

        String name1 = nameOld.welcome("аНастасия");
        String result = "Я тебя так долго ждал";
        Assertions.assertEquals(result, name1);
    }


    @Test
    public void name3(){

        ICommunicationPrinter nameOld = new Work6_3_NameUser();

        String name1 = nameOld.welcome("Вадим");
        String result = "Добрый день, а вы кто?!";
        Assertions.assertEquals(result, name1);
    }
}
