package homework3.calcs.simple.runners;

import homework3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite comp = new CalculatorWithCounterAutoComposite();

      //  4.1 + 15 * 7 + (28 / 5) ^ 2

        double result = comp.b.add(comp.b.add(4.1, comp.b.mul(15, 7)), comp.degree(comp.b.div(28, 5), 2));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.print("Калькулятор использовался : " + comp.getCountOperation() + " раз");  // Я не понимаю как создать счетчик на калькулятор, а не на методы

    }

}
