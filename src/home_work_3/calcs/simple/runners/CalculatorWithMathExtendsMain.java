package home_work_3.calcs.simple.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {



    CalculatorWithMathExtends third = new CalculatorWithMathExtends();

    // 4.1 + 15 * 7 + (28 / 5) ^ 2

    double answer = third.add(third.add(4.1, third.mul(15, 7)), third.degree(third.div(28, 5), 2));

    System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + answer);
    }
}
