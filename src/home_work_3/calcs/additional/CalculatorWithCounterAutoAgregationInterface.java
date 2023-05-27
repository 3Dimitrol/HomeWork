package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

    private int counter8;

    private ICalculator calculator;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double div(double x1, double x2){

        incrementCountOperation();

        return calculator.div(x1, x2);
    }

    // Умножение
    public double mul(double x1, double x2){

        incrementCountOperation();

        return calculator.mul(x1, x2);
    }

    // Вычитание
    public double sub(double x1, double x2){

        incrementCountOperation();

        return calculator.sub(x1, x2);
    }

    // Сложение
    public double add(double x1, double x2){

        incrementCountOperation();

        return calculator.add(x1, x2);
    }

    public double degree(double x1, int x2){
        if (x1 < 0){
            return 0;
        } else {

            incrementCountOperation();

            return calculator.degree(x1, x2);
        }

    }

    public double module(double number){

        incrementCountOperation();

        return calculator.module(number);
    }

    public double root(double number) {

        if (number < 0){
            return 0;
        } else {

            incrementCountOperation();

            return calculator.root(number);
        }
    }

    public void incrementCountOperation(){
        counter8++;
    }

    public long getCountOperation(){
        return counter8;
    }

}
