package home_work_3.calcs.simple.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite comp = new CalculatorWithCounterAutoComposite();

      //  4.1 + 15 * 7 + (28 / 5) ^ 2

        double div = comp.div(28, 5);
        double degree = comp.degree(div, 2);
        double mul = comp.mul(15, 7);
        double add = comp.add(4.1, mul);
        double result = comp.add(add, degree);


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.print("Калькулятор использовался : " + comp.getCountOperation() + " раз");  // Я не понимаю как создать счетчик на калькулятор, а не на методы

    }

}
