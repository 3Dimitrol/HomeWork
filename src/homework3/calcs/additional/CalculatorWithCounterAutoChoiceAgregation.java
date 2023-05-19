package homework3.calcs.additional;

import homework3.calcs.simple.CalculatorWithMathCopy;
import homework3.calcs.simple.CalculatorWithMathExtends;
import homework3.calcs.simple.CalculatorWithOperator;

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
