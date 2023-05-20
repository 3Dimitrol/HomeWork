package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    int counter9;

    public int getCounter9() {
        return counter9;
    }

    public void setCounter9(int counter9) {
        this.counter9 = counter9;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator foo){

    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy doo){

    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends hoo){

    }



    public long getCountOperation(){
        return getCounter9();
    }
}
