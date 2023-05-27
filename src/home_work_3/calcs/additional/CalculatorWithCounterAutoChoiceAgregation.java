package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private int counter9;

    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;


    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator){
        this.calculator1 = calculator;

    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator){
        this.calculator2 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator){
        this.calculator3 = calculator;
    }


    public double div(double x1, double x2){

        incrementCountOperation();

        if (calculator1 != null){
            return calculator1.div(x1, x2);
        } else if (calculator2 != null) {
            return calculator2.div(x1, x2);
        }
        return calculator3.div(x1, x2);
    }

    // Умножение
    public double mul(double x1, double x2){

        incrementCountOperation();

        if (calculator1 != null){
            return calculator1.mul(x1, x2);
        } else if (calculator2 != null) {
            return calculator2.mul(x1, x2);
        }
        return calculator3.mul(x1, x2);
    }

    // Вычитание
    public double sub(double x1, double x2){

        incrementCountOperation();

        if (calculator1 != null){
            return calculator1.sub(x1, x2);
        } else if (calculator2 != null) {
            return calculator2.sub(x1, x2);
        }
        return calculator3.sub(x1, x2);
    }

    // Сложение
    public double add(double x1, double x2){

        incrementCountOperation();

        if (calculator1 != null){
            return calculator1.add(x1, x2);
        } else if (calculator2 != null) {
            return calculator2.add(x1, x2);
        }
        return calculator3.add(x1, x2);
    }

    public double degree(double x1, int x2){
        if (x1 < 0){
            return 0;
        } else {

            incrementCountOperation();

            if (calculator1 != null){
                return calculator1.degree(x1, x2);
            } else if (calculator2 != null) {
                return calculator2.degree(x1, x2);
            }
            return calculator3.degree(x1, x2);
        }

    }

    public double module(double number){

        incrementCountOperation();

        if (calculator1 != null){
            return calculator1.module(number);
        } else if (calculator2 != null) {
            return calculator2.module(number);
        }
        return calculator3.module(number);
    }

    public double root(double number) {

        if (number < 0){
            return 0;
        } else {

            incrementCountOperation();

            if (calculator1 != null){
                return calculator1.root(number);
            } else if (calculator2 != null) {
                return calculator2.root(number);
            }
            return calculator3.root(number);
        }
    }


    public void incrementCountOperation(){
        counter9++;
    }

    public long getCountOperation(){
        return counter9;
    }
}
