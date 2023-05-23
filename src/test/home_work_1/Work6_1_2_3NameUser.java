package test.home_work_1;


import home_work_1.Work6_2_NameUser;
import home_work_1.Work6_3_NameUser;
import home_work_3.calcs.api.ICommunicationPrinter;

public class Work6_1_2_3NameUser {
    public static void main(String[] args) {

        ICommunicationPrinter name = new home_work_1.Work6_1_NameUser();
        ICommunicationPrinter name1 = new Work6_2_NameUser();
        ICommunicationPrinter name2 = new Work6_3_NameUser();


        System.out.println(name.welcome("Геткор"));
        System.out.println(name1.welcome("ваСИЛий"));
        System.out.println(name2.welcome("настя"));



    }

}
