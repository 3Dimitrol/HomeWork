package homework3.calcs.additional;

import homework3.calcs.simple.CalculatorWithMathExtends;


public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    protected int сounter = 0;

    public int getСounter() {
        return сounter;
    }

    public void setСounter(int сounter) {
        this.сounter = сounter;
    }

    public void incrementCountOperation(){
        setСounter(getСounter() + 1);

    }

    public long getCountOperation(){

        return getСounter();
    }










}
