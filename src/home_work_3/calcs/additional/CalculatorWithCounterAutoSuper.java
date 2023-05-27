package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private int counter1 = 0;

    public int getCounter1() {
        return counter1;
    }

    public void setCounter1(int counter1) {
        this.counter1 = counter1;
    }

    @Override
    //Степень
    public double degree(double x1, int x2) {
        if (x1 < 0) {
            return 0;
        } else {

            setCounter1(getCounter1() + 1);

            return Math.pow(x1, x2);
        }
    }

    @Override
    // Модуль
    public double module(double number){

        setCounter1(getCounter1() + 1);

        return Math.abs(number);
    }

    @Override
    // Корень
    public double root(double number) {

        if (number < 0){
            return 0;
        } else {

            setCounter1(getCounter1() + 1);

            return Math.sqrt(number);
        }
    }

    @Override
    // Сложение
    public double add(double x1, double x2){

        setCounter1(getCounter1() + 1);

        return super.add(x1, x2);
    }

    @Override
    // Вычитание
    public double sub(double x1, double x2){

        setCounter1(getCounter1() + 1);

        return super.add(x1, x2);
    }

    @Override
    // Умножение
    public double mul(double x1, double x2){

        setCounter1(getCounter1() + 1);

        return super.mul(x1, x2);
    }

    @Override
    // Деление
    public double div(double x1, double x2){

        setCounter1(getCounter1() + 1);

        return super.div(x1, x2);
    }

    // Вывод счётчика
   public long getCountOperation(){

       return getCounter1();
    }


}
