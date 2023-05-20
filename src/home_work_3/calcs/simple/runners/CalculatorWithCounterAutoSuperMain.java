package home_work_3.calcs.simple.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper fifth = new CalculatorWithCounterAutoSuper();

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double result = fifth.add(fifth.add(4.1, fifth.mul(15, 7)), fifth.degree(fifth.div(28, 5), 2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Методы из класса, импользовались : " + fifth.getCounter1() + " раз");
    }
}
