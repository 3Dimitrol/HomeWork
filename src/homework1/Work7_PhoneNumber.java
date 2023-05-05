package homework1;

// Создание статического метода createPhoneNumber

public class Work7_PhoneNumber {
    public static String createPhoneNumber(String[] number){

        return "(" + number[0] + number[1] + number[2] + ") " + number[3] + number[4] + number[5] + "-" + number[6] + number[7] + number[8] + number[9];
    }
    public static void main(String[] args) {
        String[] call  = {"4", "4", "4", "3", "5", "3", "9", "8", "9", "2"};
        String[] call1 = {"7", "4", "3", "3", "2", "3", "0", "8", "0", "2"};
        String[] call2 = {"1", "0", "9", "3", "4", "3", "8", "8", "3", "2"};
        System.out.println(Work7_PhoneNumber.createPhoneNumber(call));
        System.out.println(Work7_PhoneNumber.createPhoneNumber(call1));
        System.out.println(Work7_PhoneNumber.createPhoneNumber(call2));
    }
}
