package test.home_work_2.utils_test;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortsUtilsTest {

    @Test
    public void testSort1(){
        int[] arr = {1,2,3,4,5,6};
        int[] resultArr = SortsUtils.sort(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testShake1(){
        int[] arr = {1,2,3,4,5,6};
        int[] resultArr = SortsUtils.shake(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testSort2(){
        int[] arr = {1,1,1,1};
        int[] resultArr = SortsUtils.sort(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testShake2(){
        int[] arr = {1,1,1,1};
        int[] resultArr = SortsUtils.shake(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testSort3(){
        int[] arr = {9,1,5,99,9,9};
        int[] resultArr = SortsUtils.sort(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testShake3(){
        int[] arr = {9,1,5,99,9,9};
        int[] resultArr = SortsUtils.shake(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testSort4(){
        int[] arr = {};
        int[] resultArr = SortsUtils.sort(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testShake4(){
        int[] arr = {};
        int[] resultArr = SortsUtils.shake(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testSort5(){
        int[] arr = {6,5,4,3,2,1};
        int[] resultArr = SortsUtils.sort(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testShake5(){
        int[] arr = {6,5,4,3,2,1};
        int[] resultArr = SortsUtils.shake(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testSort6(){
        int[] arr = {48,2,13,400,9,1000};
        int[] resultArr = SortsUtils.sort(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testShake6(){
        int[] arr = {48,2,13,400,9,1000};
        int[] resultArr = SortsUtils.shake(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testSort7(){
        int[] arr = ArraysUtils.arrayRandom(18, 100);
        int[] resultArr = SortsUtils.sort(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

    @Test
    public void testShake7(){
        int[] arr = ArraysUtils.arrayRandom(18, 100);;
        int[] resultArr = SortsUtils.shake(arr);
        Arrays.sort(arr);
        Assertions.assertArrayEquals(arr, resultArr);
    }

}
