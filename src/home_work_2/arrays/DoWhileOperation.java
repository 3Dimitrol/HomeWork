package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_3.calcs.api.IArraysOperation;

public class DoWhileOperation {

    public static void main(String[] args) {


    IArraysOperation arr1 = new ArraysIteration();
        int[] arrays = ArraysUtils.arrayFromConsole();
        arr1.iterationDoWhile(arrays);
        arr1.twoElementsDoWhile(arrays);
        arr1.reversDoWhile(arrays);


    }
}
