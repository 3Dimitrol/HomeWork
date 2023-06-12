package test.home_work_5;

import home_work_5.DataContainer2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataContainer2Test {

    @Test
    public void addOneElementToEmptyContainer(){
        DataContainer2 container = new DataContainer2(new Integer[0]);

        int idx = container.add(1);
        Assertions.assertEquals(1, container.get(idx));
    }

    @Test
    public void addOTwoElementToEmptyContainer(){
        DataContainer2 container = new DataContainer2(new Integer[0]);

        int idx1 = container.add(1);
        int idx2 = container.add(2);
        Assertions.assertEquals(1, container.get(idx1));
        Assertions.assertEquals(2, container.get(idx2));
    }


    @Test
    public void addOneElementToNotEmptyContainer(){
        DataContainer2 container = new DataContainer2(new Integer[]{1, 2, 3});

        int idx = container.add(777);
        Assertions.assertEquals(777, container.get(idx));
    }

    @Test
    public void addOneElementToNotEmptyContainerWithNull(){
        DataContainer2 container = new DataContainer2(new Integer[]{1, 2, 3, null, null, null});

        int idx = container.add(777);
        Assertions.assertEquals(3, idx);
    }

    @Test
    public void addNull(){
        DataContainer2 container = new DataContainer2(new Integer[]{1, 2, 3, null, null, null});

        int idx = container.add(null);
        Assertions.assertEquals(-1, idx);
    }

    @Test
    public void addToMid(){
        DataContainer2 container = new DataContainer2(new Integer[]{1, null, 3, null, null, null});

        int idx = container.add(777);
        Assertions.assertEquals(1, idx);
    }

    @Test
    public void getIncorrectIndex(){
        DataContainer2 container = new DataContainer2(new Integer[]{});


        Assertions.assertEquals(null, container.get(9999));
    }

    @Test
    public void getItems(){
        DataContainer2 container = new DataContainer2(new Integer[]{1, 2, 3});

        container.add(777);
        Integer[] items = container.getItems();
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 777}, items);
    }

    @Test
    public  void deleteMidElementByIndex(){
        DataContainer2 container = new DataContainer2(new Integer[]{1,3,4});

        container.delete(1);
        Assertions.assertEquals(4, container.get(1));
    }

    @Test
    public  void deleteFirstElementByIndex(){
        DataContainer2 container = new DataContainer2(new Integer[]{1,3,4});


        Assertions.assertTrue(container.delete(0));
        Assertions.assertEquals(3, container.get(0));
    }

    @Test
    public  void deleteLastElementByIndex(){
        DataContainer2 container = new DataContainer2(new Integer[]{1,3,4});


        Assertions.assertTrue(container.delete(2));
    }

    @Test
    public  void deleteByIndexInEnptyConyainer(){
        DataContainer2 container = new DataContainer2(new Integer[]{1,3,4});


        Assertions.assertTrue(container.delete(2));
    }

    @Test
    public  void deleteElement(){
        DataContainer2 container = new DataContainer2(new Integer[]{1,3,4});

        container.delete((Integer)3);
        Assertions.assertEquals(4, container.get(1));
    }

    @Test
    public  void sort(){
        DataContainer2 container = new DataContainer2(new Integer[]{3,2,1});

        container.sort();

        Integer[] item = container.getItems();

        Assertions.assertArrayEquals(new Integer[]{1,2,3}, item);
    }

    @Test
    public  void sortCheckOldData(){
        Integer[] data = {3,2,1};

        DataContainer2 container = new DataContainer2(data);

        container.sort();

        Integer[] item = container.getItems();

        Assertions.assertFalse(data == item);
        Assertions.assertArrayEquals(new Integer[]{3,2,1}, data);
        Assertions.assertArrayEquals(new Integer[]{1,2,3}, item);
    }

}