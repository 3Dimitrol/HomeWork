package test.home_work_2.arrays_test;

import home_work_2.arrays.ArraysIteration;
import home_work_2.utils.ArraysUtils;
import home_work_3.calcs.api.IArraysOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhileOperationTest {

    public static int[] afat(int[] x1) {


        IArraysOperation arr1 = new ArraysIteration();
        int[] arrays = x1; //[6] - 1, 2, 3, 4, 5, 6
    //   return arr1.iterationWhile(arrays);
    //   return arr1.twoElementsWhile(arrays);
       return arr1.reversWhile(arrays);


    }

    @Test
    public void test1(){
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] result1 = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(result1, arr1);

    }

    @Test
    public void test2(){
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = WhileOperationTest.afat(arr1);
        int[] result2 = {0, 2, 0, 4, 0, 6};
        Assertions.assertArrayEquals(result2, arr2);
    }

    @Test
    public void test3(){
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = WhileOperationTest.afat(arr1);
        int[] result3 = {6, 5, 4, 3, 2, 1};
        Assertions.assertArrayEquals(result3, arr3);
    }

    @Test
    public void test4(){
        int[] arr1 = new int[6];
        boolean arrLength = arr1.length == 6;
        Assertions.assertEquals(true, arrLength);
    }
}
