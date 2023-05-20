package home_work_1;

// Перевести из байты в килобайты

public class Work4_4BranchingOperator {
    public static void main(String[] args) {

        double number = 10; // Значение вводимое пользователем
        String name = "B"; // Переводная еденица, выбронная пользователем

        if (name.equalsIgnoreCase("k")) {
            double action = number / 1024;
            System.out.println(number + " bytes = " + action + " kilobytes");

        }else if (name.equalsIgnoreCase("b")) {
            double action = number * 1024;
            System.out.println(number + " kilobytes = " + action + " bytes");

        } else {
            System.out.println("Ты опять за своё???");
        }
    }
}
