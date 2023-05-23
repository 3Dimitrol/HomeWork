package test.home_work_2.arrays_test;

import home_work_2.arrays.Work_h_2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Work_h_2_4Test {


    @Test
    public void testPositiveElements1(){

        int[] arr1 = {71, 25, 6, 9, 10, 2, 6, 0, 48};
        int number = Work_h_2_4.positiveElements(arr1);
        int result = 72;
        Assertions.assertEquals(result, number);
    }
    @Test
    public void testPositiveElements2(){

        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int number = Work_h_2_4.positiveElements(arr1);
        int result = 0;
        Assertions.assertEquals(result, number);
    }

    @Test
    public void testMaxElement1(){
        int[] arr1 = {71, 25, 6, 9, 10, 2, 6, 0, 48};
        int number = Work_h_2_4.maxElement(arr1);
        int result = 25;
        Assertions.assertEquals(result, number);
    }

    @Test
    public void testMaxElement2(){
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int number = Work_h_2_4.maxElement(arr1);
        int result = 0;
        Assertions.assertEquals(result, number);
    }

    @Test
    public void testMed1(){
        int[] arr1 = {71, 25, 6, 9, 10, 2, 6, 0, 48};
        int number = Work_h_2_4.med(arr1);
        int arithmeticMean = 19;
        Assertions.assertEquals(arithmeticMean, number);
    }

    @Test
    public void testMed2(){
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int number = Work_h_2_4.med(arr1);
        int arithmeticMean = 0;
        Assertions.assertEquals(arithmeticMean, number);
    }

    @Test
    public void tetsMin_min1(){
        int[] arr1 = {71, 25, 6, 9, 10, 2, 6, 0, 48};
        int[] arrays = Work_h_2_4.min_min(arr1);
        int[] result = {0, 2};
        Assertions.assertArrayEquals(result, arrays);
    }

    @Test
    public void testMin_min2(){
        int[] arr1 = {0, 0, 0, 0, -10, 0, 0, 0, 0};
        int[] arrays = Work_h_2_4.min_min(arr1);
        int[] result = {-10, 0};
        Assertions.assertArrayEquals(result, arrays);
    }


    @Test
    public void testCompression1(){
        int[] arr1 = {71, 25, 6, 9, 10, 2, 6, 0, 48};
        int[] arrays = Work_h_2_4.compression(arr1);
        int[] resultArr = {71, 0, 6, 9, 0, 2, 6, 0, 48};
        Assertions.assertArrayEquals(resultArr,arrays);
    }


    @Test
    public void testCompression2(){
        int[] arr1 = {71, 25, 6, 9, 10, 2, 6, 0, 48};
        int[] arrays = Work_h_2_4.compression(arr1);
        int[] resultArr = {71, 6, 9, 2, 6, 48, 0, 0, 0};
        Assertions.assertArrayEquals(resultArr,arrays);
    }


    @Test
    public void testAmount1(){
        int[] arr1 = {71, 25, 6, 9, 10, 2, 6, 0, 48};
        int number = Work_h_2_4.amount(arr1);
        int result = 51;
        Assertions.assertEquals(result, number);
    }

    @Test
    public void testAmount2(){
        int[] arr1 = {71, 25, -6, 9, -10, 2, -6, 0, 48};
        int number = Work_h_2_4.amount(arr1);
        int result = 38;
        Assertions.assertEquals(result, number);
    }

}
