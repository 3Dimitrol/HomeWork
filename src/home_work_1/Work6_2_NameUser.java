package home_work_1;

import home_work_3.calcs.api.ICommunicationPrinter;

// import java.util.Scanner;

public class Work6_2_NameUser implements ICommunicationPrinter {
    public String welcome(String nameFirst)  {

        /* Scanner name = new Scanner(System.in);
        System.out.print("Как вас зовут?  -  ");
        String nameUser = name.nextLine(); */

        if ((nameFirst.equalsIgnoreCase("Вася")) || (nameFirst.equalsIgnoreCase("Василий"))){
            return "Привет! \nЯ тебя так долго ждал";
        }else if ((nameFirst.equalsIgnoreCase("Анастасия")) || (nameFirst.equalsIgnoreCase("Настя"))){
            return "Я тебя так долго ждал";
        }else if (nameFirst.equalsIgnoreCase("Дмитрий")){
            return "Добро пожаловать, господин! \nМы вам рады!";
        } else {
            return "Добрый день, а вы кто?!";
        }
    }
}
