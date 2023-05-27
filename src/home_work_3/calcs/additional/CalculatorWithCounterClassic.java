package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;


public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private int сounter;

    public int getСounter() {
        return сounter;
    }

    public void setСounter(int сounter) {
        this.сounter = сounter;
    }

    public void incrementCountOperation(){
        setСounter(getСounter() + 1);   // counter ++

    }

    public long getCountOperation(){

        return getСounter();
    }










}
