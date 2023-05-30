package home_work_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class DataContainer <T>{

    private T[] data;

    public T[] getData() {
        return this.data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public DataContainer() {
        T[] arr = (T[]) new Integer[1];
        this.data = arr;
    }

    public int add(T item) {
        T[] arr2 = this.data;
        if(item == null){
            return -1;
        } else {
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == null) {
                    arr2[i] = item;
                    setData(arr2);
                    return i;
                } else {
                    T[] arr3 = Arrays.copyOf(arr2, arr2.length + 1);
                    for (int j = 0; j < arr3.length; j++) {
                        if (arr3[j] == null) {
                            arr3[j] = item;
                            setData(arr3);
                            return j;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public T get(int index){
        T[] array = this.data;
        if (array.length < index){
            T[] array2 = Arrays.copyOf(array, index + 1);
            return array2[index];
        }
        return array[index];
    }


    public T[] getItems(){
        T[] arr2 = this.data;
        return arr2;
    }

    public boolean delete1(int index){
       T[] arrays =  getItems();

       if (arrays.length > index) {
           Scanner org = new Scanner(System.in);
           System.out.print("1. Заменить \n2. Удалить \nВыберите дейтсвие : ");
           int war = org.nextInt();
           if(war == 1){
               arrays[index] = null;
               return true;
           } else {
               T number = arrays[arrays.length - 1];
               arrays[arrays.length - 1] = arrays[index];
               arrays[index] = number;
               T[] array2 = Arrays.copyOf(arrays, arrays.length - 1);
               setData(array2);
               return true;
           }
       }
           return false;
   }

   public boolean delete2(T item) {  // В этом методе появился вопрос, если я прошу метод удалить число 777, оно его не удаляет и выводит false, но если сделать 77, то все работает? Это как-то связано с пределами?
       T[] arrays3 = getData();
       if (item == null) {
           return false;
       } else {
           for (int i = 0; i < arrays3.length;i++) {
               if (arrays3[i] == item) {
                   if (i == arrays3.length - 1) {
                       arrays3[i] = null;
                       T[] array4 = Arrays.copyOf(arrays3, arrays3.length - 1);
                       setData(array4);
                       return true;
                   } else {
                       T number = arrays3[i + 1];
                       arrays3[i + 1] = arrays3[i];
                       arrays3[i] = number;
                   }
               }
           }
           return false;
       }
   }

   public void sort(Comparator<Integer> comparator) {
       Compar box = new Compar();
       T[] array5 = getData();
       T number;
       for (int i = 0; i < array5.length; i++) {
           for (int k = array5.length - 1; k > i; k--) {
               if (box.compare((Integer) array5[k - 1], (Integer) array5[k]) < 0) {
                   number = array5[k - 1];
                   array5[k - 1] = array5[k];
                   array5[k] = number;
               }
           }
           setData(array5);
       }
   }

    public static void main(String[] args) {
        DataContainer<Integer> box1 = new DataContainer<>();
        Compar box = new Compar();
        box1.add(1);
        box1.add(2);
        box1.add(3);
        System.out.println("Номер позиции : " + box1.add(127));
        System.out.println("Номер позиции : " + box1.add(127));
        System.out.println("Номер позиции : " + box1.add(77));
        System.out.println("Номер позиции : " + box1.add(10));
       // System.out.println("Номер позиции : " + box1.add(999));
       // System.out.println("Номер позиции : " + box1.add(null));
        System.out.println(Arrays.toString(box1.getData()));
       // System.out.println(box1.get(box1.add(777)));
       // System.out.println(box1.get(3));
       // System.out.println(box1.get(8));
       // System.out.println(Arrays.toString(box1.getItems()));
       // System.out.println(box1.delete1(3));
       // System.out.println(Arrays.toString(box1.getItems()));
       // System.out.println(box1.delete1(9));
       // System.out.println(box1.delete2(127));
       // System.out.println(Arrays.toString(box1.getData()));
        box1.sort(new Compar());
        System.out.println(Arrays.toString(box1.getData()));
        System.out.println("Прошу прощение, но что делать дальше я не понимаю");
    }
}
