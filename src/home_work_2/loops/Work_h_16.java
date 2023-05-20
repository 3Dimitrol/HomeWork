package home_work_2.loops;

public class Work_h_16 {
    public static void main(String[] args) {
        System.out.println("              Таблица умножения");
        System.out.print("\n");
        for (int i = 1; i <= 10; i++) {
            for (int l = 2; l <= 5; l++) {
                System.out.print(l + " x " + i + " = " + (l * i) + "\t");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int a = 1; a <= 10; a++) {
            for (int k = 6; k <= 9; k++) {
                System.out.print(k + " x " + a + " = " + (k * a) + "\t");
            }
            System.out.println();
        }
    }
}
