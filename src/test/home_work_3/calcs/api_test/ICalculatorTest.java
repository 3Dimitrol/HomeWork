package test.home_work_3.calcs.api_test;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ICalculatorTest {

    ICalculator calc = new CalculatorWithMathCopy();

    @Test
    public void iCalc0(){
        double div = calc.div(18, 3);
        double exp = 6;
        Assertions.assertEquals(exp, div);
    }


    @Test
    public void calcNumber(){
        double prim = calc.add(calc.add(4.1, calc.mul(15, 7)), calc.degree(calc.div(28, 5), 2));
        double exp = 140.45999999999998;
        Assertions.assertEquals(exp, prim);
    }

    @Test
    public void iCalc2(){
        double div = calc.mul(18, 3);
        double exp = 54;
        Assertions.assertEquals(exp, div);
    }

    @Test
    public void iCalc3(){
        double div = calc.sub(18, 3);
        double exp = 15;
        Assertions.assertEquals(exp, div);
    }

    @Test
    public void iCalc4(){
        double div = calc.div(18, 3);
        double exp = 6;
        Assertions.assertEquals(exp, div);
    }

    @Test
    public void iCalc5(){
        double div = calc.add(18, 3);
        double exp = 21;
        Assertions.assertEquals(exp, div);
    }

    @Test
    public void iCalc6(){
        double div = calc.div(18, 3);
        double exp = 6;
        Assertions.assertEquals(exp, div);
    }

    @Test
    public void iCalc7(){
        double div = calc.degree(18, 3);
        double exp = 5832;
        Assertions.assertEquals(exp, div);
    }

    @Test
    public void iCalc8(){
        double div = calc.module(-18);
        double exp = 18;
        Assertions.assertEquals(exp, div);
    }

    @Test
    public void iCalc9(){
        double div = calc.root(18);
        double exp = 4.242640687119285;
        Assertions.assertEquals(exp, div);
    }
}
