package home_work_1;

public class Work5_StaticMethod {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }
    public static void main(String[] args) {
        boolean week = true;
        boolean vac = false;

        if (Work5_StaticMethod.sleepIn(week, vac)){
            System.out.println("У вас отпуск, отдыхайте");
          } else {
            System.out.println("Сегодня рабочий день, пора вставать");
        }
    }
}
