package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {


    // Деление
    public double div(double x1, double x2){

        return x1 / x2;
    }

    // Умножение
    public double mul(double x1, double x2){

        return x1 * x2;
    }

    // Вычитание
    public double sub(double x1, double x2){

        return x1 - x2;
    }

    // Сложение
    public double add(double x1, double x2){

        return x1 + x2;
    }


    public double degree(double number, int deg){
        if (number < 0){
            return 0;
        } else {

            double count = 1;
            double result = 1;

            for (int i = 0; i < deg; i++) {

                result = count * number;
                count = result;

            }
            return result;
        }
    }

    public double module(double number){

        if (number < 0){
            return number * (-1);
        }
        return number;
    }

    public double root(double number) {

        if (number < 0){
            return 0;
        } else {
        return Math.sqrt(number);
        }
    }
}
