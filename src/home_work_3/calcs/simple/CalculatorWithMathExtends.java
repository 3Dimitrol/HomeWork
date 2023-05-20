package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {


    public double degree(double x1, int x2){
        if (x1 < 0){
            return 0;
        } else {

            return Math.pow(x1, x2);
        }

    }

    public double module(double number){

        return Math.abs(number);
    }

    public double root(double number) {

        if (number < 0){
            return 0;
        } else {
            return Math.sqrt(number);
        }
    }

}
