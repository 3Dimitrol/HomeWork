package home_work_2.loops;

public class Work_h_16 {
    public static void tabl(int x1, int x2, int x3, int x4) { //x1 = 1 x2 = 2 x3 = 5 x4 = 9
        System.out.println("              Таблица умножения");
        System.out.print("\n");
        for (int i = x1; i <= x2; i++) {
            for (int l = 2; l <= x3; l++) {
                System.out.print(l + " x " + i + " = " + (l * i) + "\t");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int a = x1; a <= x2; a++) {
            for (int k = x3 + 1; k <= x4; k++) {
                System.out.print(k + " x " + a + " = " + (k * a) + "\t");
            }
            System.out.println();
        }
    }
}
