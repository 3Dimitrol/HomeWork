package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_3.calcs.api.IArraysOperation;

public class ForOperation {

    public static void main(String[] args) {


        IArraysOperation arr1 = new ArraysIteration();
        int[] arrays = ArraysUtils.arrayFromConsole();
        arr1.iterationFor(arrays);
        arr1.twoElementsFor(arrays);
        arr1.reversFor(arrays);


    }
}
