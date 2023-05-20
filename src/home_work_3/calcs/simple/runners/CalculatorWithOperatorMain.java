package home_work_3.calcs.simple.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator first = new CalculatorWithOperator();

        //  4.1 + 15 * 7 + (28 / 5) ^ 2

        double result = first.add(first.add(4.1, first.mul(15, 7)), first.degree(first.div(28, 5), 2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);


    }
}
