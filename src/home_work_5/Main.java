package home_work_5;

public class Main {
    public static void main(String[] args) {
        DataContainer<Integer> container1 = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});
        DataContainer<Integer> container2 = new DataContainer<>(new Integer[]{1, 2, 3, null});
        DataContainer<Integer> container3 = new DataContainer<>(new Integer[]{});

        System.out.println(container1);
        System.out.println(container2);
        System.out.println(container3);

    }
}
