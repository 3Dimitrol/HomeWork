package homework3.calcs.additional;

import homework3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation{





    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy g){

    }


    int counter8 = 0;

    public int getCounter8() {

        return counter8;
    }

    public void setCounter8(int counter8) {
        this.counter8 = counter8;
    }



public long getCountOperation(){

    return getCounter8();
    }

}
