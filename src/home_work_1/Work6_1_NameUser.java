package home_work_1;

import java.util.Scanner;

public class Work6_1_NameUser {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.print("Как вас зовут?  -  ");
        String nameUser = name.nextLine();

        if((nameUser.equalsIgnoreCase("Вася")) || (nameUser.equalsIgnoreCase("Анастасия")) || (nameUser.equalsIgnoreCase("Дмитрий"))){
            if ((nameUser.equalsIgnoreCase("Вася")) || (nameUser.equalsIgnoreCase("Анастасия"))) {
                if ((nameUser.equalsIgnoreCase("Вася"))){
                    System.out.println("Привет! \nЯ тебя так долго ждал");
                }else{
                    System.out.println("Я тебя так долго ждал");
                }

            } else {
                System.out.println("Добро пожаловать, господин! \nМы вам рады!");
            }

            }else{
                System.out.println("Добрый день, а вы кто?!");
            }

    }
}
