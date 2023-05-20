package home_work_1;

import java.util.Scanner;

public class Work6_2_NameUser {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.print("Как вас зовут?  -  ");
        String nameUser = name.nextLine();

        boolean namePeople = (nameUser.equalsIgnoreCase("Вася")) || (nameUser.equalsIgnoreCase("Анастасия")) || (nameUser.equalsIgnoreCase("Дмитрий"));

        if ((nameUser.equalsIgnoreCase("Вася")) || (nameUser.equalsIgnoreCase("Василий"))){
            System.out.println("Привет! \nЯ тебя так долго ждал");
        }else if ((nameUser.equalsIgnoreCase("Анастасия")) || (nameUser.equalsIgnoreCase("Настя"))){
            System.out.println("Я тебя так долго ждал");
        }else if (nameUser.equalsIgnoreCase("Дмитрий")){
            System.out.println("Добро пожаловать, господин! \nМы вам рады!");
        } else if (namePeople == false) {
            System.out.println("Добрый день, а вы кто?!");
        }
    }
}
