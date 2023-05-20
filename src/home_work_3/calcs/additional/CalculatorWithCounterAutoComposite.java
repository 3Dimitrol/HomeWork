package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {

    public CalculatorWithCounterAutoComposite(){
       setCounter3(getCounter3() + 1);
    }
public CalculatorWithMathCopy b = new CalculatorWithMathCopy();

    protected int counter3 = 0;

    public int getCounter3() {
        return counter3;
    }

    public void setCounter3(int counter3) {
        this.counter3 = counter3;
    }

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

   public long getCountOperation(){
        return getCounter3();
    }

}
