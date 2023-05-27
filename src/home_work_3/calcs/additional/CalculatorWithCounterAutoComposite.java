package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {


    private int counter3;

    private CalculatorWithMathCopy b = new CalculatorWithMathCopy();

  /*  public CalculatorWithCounterAutoComposite() {
        this.b = new CalculatorWithMathCopy();
    }*/

    public double div(double x1, double x2){

        incrementCountOperation();

        return b.div(x1, x2);
    }

    // Умножение
    public double mul(double x1, double x2){

        incrementCountOperation();

        return b.mul(x1, x2);
    }

    // Вычитание
    public double sub(double x1, double x2){

        incrementCountOperation();

        return b.sub(x1, x2);
    }

    // Сложение
    public double add(double x1, double x2){

        incrementCountOperation();

        return b.add(x1, x2);
    }

    public double degree(double x1, int x2){
        if (x1 < 0){
            return 0;
        } else {

            incrementCountOperation();

            return b.degree(x1, x2);
        }

    }

    public double module(double number){

        incrementCountOperation();

        return b.module(number);
    }

    public double root(double number) {

        if (number < 0){
            return 0;
        } else {

            incrementCountOperation();

            return b.root(number);
        }
    }

    public void incrementCountOperation(){
        counter3++;
    }

   public long getCountOperation(){
        return counter3;
    }

}
