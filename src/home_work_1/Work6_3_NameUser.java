package home_work_1;

import home_work_3.calcs.api.ICommunicationPrinter;

// import java.util.Scanner;

public class Work6_3_NameUser implements ICommunicationPrinter {
    public String welcome(String nameFirst) {

     /*   Scanner name = new Scanner(System.in);
        System.out.print("Как вас зовут?  -  ");
        String nameUser = name.nextLine(); */

        switch (nameFirst){
            case "Вася":
            case "вася":
            case "Василий":
            case "василий":
                return "Привет! \nЯ тебя так долго ждал";

            case "Анастасия":
            case "анастасия":
            case "Настя":
            case "настя":
                return "Я тебя так долго ждал";

            case "Дмитрий":
                return "Добро пожаловать, господин! \nМы вам рады!";
            default:
                return "Добрый день, а вы кто?!";
        }
    }
}
