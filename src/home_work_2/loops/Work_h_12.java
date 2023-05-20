package home_work_2.loops;

public class Work_h_12 {
    public static void main(String[] args) {

        String d = ".";   // Зажаём переменную для проверки дробного числа
        String m = ",";   // Зажаём переменную для проверки дробного числа
        String h = args[0];
        for (int l = 0; l < h.length(); l++){
            char kol = h.charAt(l);   // Берём каждый символ введённого значения через аргумент
            String gg = String.valueOf(kol);  // Переводим в строку
            if (d.equals(gg)){    // Если хоть один сивол "точка", то программа завершается
                System.out.println("Введено не целое число");
                return;
            } else if (m.equals(gg)) {  // Если хоть один сивол "запятая", то программа завершается
                System.out.println("Введено не целое число");
                return;
            }
            if ((kol >= 65 && kol <= 90) || (kol >= 97 && kol <= 122) || (kol >= 1040 && kol <= 1103)){  // Если хоть один сивол соответствует номеру буквы в таблице ASCII, то программа завершается
                System.out.println("Введено не число");
                return;
            } else if ((kol >= 32 && kol <= 47) || (kol >= 58 && kol <= 64)){  // Если хоть один сивол соответствует номеру символа в таблице ASCII, то программа завершается
                System.out.println("Введено не число");
                return;
            }
        }
        String tee = args[0];  //"tee" такая же переменная как и "h", так как сначало решалась задача, а полсе добавлялись проверки. А как говортися: работает - не трогай =)
        int moon = 1;
        int a = 0;
        for (int i = 1; i <= tee.length(); i++) {

            char fog = tee.charAt(a);  //Берётся каждый символ
            String jolo = String.valueOf(fog);  // Переводится в String для того что бы дальше , его можно было перевести в int
            int heeeelp = Integer.parseInt(jolo);  //Переводим в int
            moon = moon * heeeelp;  // Произведение всех чисел
            a++;
            if (i < tee.length()){

                System.out.print(jolo + " * ");
            } else {
                System.out.println(tee.charAt(tee.length() - 1) + " = " + moon);
            }
        }
    }
}
