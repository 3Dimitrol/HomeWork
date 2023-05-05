package homework1;

import java.util.Scanner;

public class Work6_3_NameUser {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.print("Как вас зовут?  -  ");
        String nameUser = name.nextLine();

        switch (nameUser){
            case "Вася":
            case "вася":
            case "Василий":
            case "василий":
                System.out.println("Привет! \nЯ тебя так долго ждал");
                break;
            case "Анастасия":
            case "анастасия":
            case "Настя":
            case "настя":
                System.out.println("Я тебя так долго ждал");
                break;
            case "Дмитрий":
                System.out.println("Добро пожаловать, господин! \nМы вам рады!");
                break;
            default:
                System.out.println("Добрый день, а вы кто?!");
        }
    }
}
