package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_3.calcs.api.IArraysOperation;

public class WhileOperation {

    public static void main(String[] args) {


        IArraysOperation arr1 = new ArraysIteration();
        int[] arrays = ArraysUtils.arrayFromConsole();
        arr1.iterationWhile(arrays);
        arr1.twoElementsWhile(arrays);
        arr1.reversWhile(arrays);


    }
}
