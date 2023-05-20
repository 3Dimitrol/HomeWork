package home_work_3.calcs.simple.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

    CalculatorWithCounterClassic forte = new CalculatorWithCounterClassic();

    // 4.1 + 15 * 7 + (28 / 5) ^ 2

    double x1 = forte.mul(15, 7);
    forte.incrementCountOperation();

    double x2 = forte.div(28, 5);
    forte.incrementCountOperation();

    double x3 = forte.degree(x2, 2);
    forte.incrementCountOperation();

    double x4 = forte.add(4.1, x1);
    forte.incrementCountOperation();

    double x5 = forte.add(x4, x3);
    forte.incrementCountOperation();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + x5);
        System.out.println("В данном примере, калькулятор использовался : " + forte.getCountOperation() + " раз.");



    }
}
