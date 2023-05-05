package homework1;

import java.util.Scanner;

public class Work3_2_ClassMath {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Выберите операцию: \n   1) Возведение в степень \n   2) Извлечение корня \n \nУкажите номер операции : ");
        int option = number.nextInt();

        if (option == 1){
            System.out.print("Введиет число : ");
            long numberJoin = number.nextInt();

            System.out.print("Введите степень возведения : ");
            long degree = number.nextInt();

            double decision = Math.pow(numberJoin, degree);

            System.out.println(numberJoin + " в " + degree + " степени равно -> " + decision);
        } else if (option == 2) {
            System.out.print("Какой корень хотите извлечь: \n   1) Квадратный \n   2) Кубический \n \nУкажите номер операции : ");
            int root = number.nextInt();
                   if (root == 1) {
                       System.out.print("Введите число : ");
                       long numberRoot = number.nextInt();
                       double resul1 = Math.sqrt(numberRoot);
                       System.out.println("Квдратный корень из " + numberRoot + " равен -> " + resul1);
                   } else if (root == 2) {
                       System.out.print("Введите число : ");
                       long numberRoot2 = number.nextInt();
                       double resul1 = Math.sqrt(numberRoot2);
                       System.out.println("Кубический корень из " + numberRoot2 + " равен -> " + resul1);
                   } else {
                       System.out.println("Данного номера нет в списке, пожалуйста, начните с начало и выберите номер из списка");

                   }

        } else {
            System.out.println("Данного номера нет в списке, пожалуйста, начните с начало и выберите номер из списка");
        }


    }
}
