package home_work_3.calcs.simple.runners;


import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoChoiceAgregation comp = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation comp2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAgregation comp3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());


        double div = comp.div(28, 5);
        double degree = comp.degree(div, 2);
        double mul = comp.mul(15, 7);
        double add = comp.add(4.1, mul);
        double result = comp.add(add, degree);


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);

        System.out.println("Калькулятор использовался : " + comp.getCountOperation() + " раз"); // Прости, но я всё ещё не понял как сделать счетчик



        double div2 = comp2.div(28, 5);
        double degree2 = comp2.degree(div2, 2);
        double mul2 = comp2.mul(15, 7);
        double add2 = comp2.add(4.1, mul2);
        double result2 = comp2.add(add2, degree2);


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result2);

        System.out.println("Калькулятор использовался : " + comp.getCountOperation() + " раз"); // Прости, но я всё ещё не понял как сделать счетчик



        double div3 = comp3.div(28, 5);
        double degree3 = comp3.degree(div3, 2);
        double mul3 = comp3.mul(15, 7);
        double add3 = comp3.add(4.1, mul3);
        double result3 = comp2.add(add3, degree3);


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result3);

        System.out.println("Калькулятор использовался : " + comp.getCountOperation() + " раз"); // Прости, но я всё ещё не понял как сделать счетчик
    }
}


