package home_work_3.calcs.simple.runners;


import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

        // 4.1 + 15 * 7 + (28 / 5) ^ 2


        CalculatorWithCounterAutoAgregation comp = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());

        double div = comp.div(28, 5);
        double degree = comp.degree(div, 2);
        double mul = comp.mul(15, 7);
        double add = comp.add(4.1, mul);
        double result = comp.add(add, degree);


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);

        System.out.print("Калькулятор использовался : " + comp.getCountOperation() + " раз"); // Прости, но я всё ещё не понял как сделать счетчик

    }
}
