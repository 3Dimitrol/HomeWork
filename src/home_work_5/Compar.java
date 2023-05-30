package home_work_5;

import java.util.Comparator;

public class Compar implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        int number1 = o1;
        int number2 = o2;

        return number2 - number1;
    }
}
