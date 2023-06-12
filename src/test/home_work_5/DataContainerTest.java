package test.home_work_5;

import home_work_5.Compar;
import home_work_5.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class DataContainerTest {

    @Test
    public void elementIndex(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});

        Assertions.assertEquals(3, container.add(777));
    }

    @Test
    public void nullElement(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});

        Assertions.assertEquals(-1, container.add(null));
    }

    @Test
    public void elementIndex1(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});

        Assertions.assertEquals(1, container.add(777));
    }


    @Test
    public void elementIndexArr(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3});

        Assertions.assertEquals(3, container.add(777));
    }


    @Test
    public void elementIndexSpace(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[0]);

        Assertions.assertEquals(0, container.add(777));
    }


    @Test
    public void elementItem(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[0]);

        int index = container.add(9999);
        Assertions.assertEquals(0, index);
        Assertions.assertEquals(9999, container.get(0));
    }

    @Test
    public void elementItemNull(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{9999});

        Assertions.assertNull(container.get(1));
        Assertions.assertEquals(9999, container.get(0));
    }

    @Test
    public void elementDelete3(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        boolean delete = container.delete(3);
        Assertions.assertTrue(delete);
    }

    @Test
    public void elementDelete9(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        boolean delete = container.delete(9);
        Assertions.assertFalse(delete);
    }

    @Test
    public void itemDelete(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        container.delete(2);
        int item = container.get(2);
        Assertions.assertEquals(777, item);

    }

    @Test
    public void elementDeleteItemNull(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        boolean delete = container.delete(null);
        Assertions.assertFalse(delete);
    }

    @Test
    public void elementDeleteItem(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        boolean delete = container.delete((Integer)777);
        Assertions.assertTrue(delete);
    }

    @Test
    public void elementDeleteNoItem(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777});

        boolean delete = container.delete((Integer)111);
        Assertions.assertFalse(delete);
    }

    @Test
    public void elementDeleteItem3(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});

        container.delete((Integer) 3);
        Assertions.assertEquals(777, container.get(2));
    }


    @Test
    public void sort(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{3, 1, 3, 777});

        Comparator<Integer> comp = new Compar();
        Comparator<Integer> reversed = comp.reversed();
        container.sort(reversed);

        Integer[] item = container.getItems();
        Assertions.assertArrayEquals(new Integer[]{1,3,3,777}, item);
    }

    public void toStringe(){
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});

        container.toString();

    }
















}
