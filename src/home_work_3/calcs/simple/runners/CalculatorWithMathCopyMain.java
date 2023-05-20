package home_work_3.calcs.simple.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy second = new CalculatorWithMathCopy();

      //  4.1 + 15 * 7 + (28 / 5) ^ 2

        double result = second.add(second.add(4.1, second.mul(15, 7)), second.degree(second.div(28, 5), 2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
