package home_work_5;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class DataContainer <T>{

    private T[] data;

    public DataContainer(T[] arrays) {
        this.data = copyOf(arrays, arrays.length);
    }

    public int add(T item) {
     if (item == null){
         return -1;
     }
        int index = -1;
        for (int i = 0; i < this.data.length; i++) {
            if(this.data[i] == null){
                index = i;
                break;
            }
        }
        if(index == -1) {

            index = this.data.length;

            this.data = copyOf(this.data, this.data.length + 1);
        }
        this.data[index] = item;
        return index;
    }
    public T get(int index){
        if (index <= this.data.length && index > 0){
            return  null;
        }
        return this.data[index];
    }
    public T[] getItems(){
        this.data = copyOf(this.data, this.data.length);
        return this.data;
    }



    public boolean delete(int index){
        if (!(index <= this.data.length && index >= 0)){
            return false;
        }
           Scanner org = new Scanner(System.in);
           System.out.print("1. Заменить \n2. Удалить \nВыберите дейтсвие : ");
           int war = org.nextInt();

           for(int i = index + 1; i < this.data.length;i++){   //
               this.data[i - 1] = this.data[i];
           }
           if(war == 1){
               this.data[this.data.length - 1] = null;
               return true;
           } else {
               this.data = copyOf(this.data, this.data.length - 1);
               return true;
           }
   }

   public boolean delete(T item) {

        if(item == null){
            return false;
        }

        for(int i = 0; i < this.data.length; i++){
            if(item.equals(this.data[i])){
               return delete(i);
            }
        }
       return false;
   }

   public void sort(Comparator<T> comparator) {
       int left = 0;
       int right = this.data.length - 1;
       T currVal;
       int haveChanges;

       do{
           haveChanges = 0;
           for (int i = left; i<right; i++){
               if(comparator.compare(this.data[i], this.data[i + 1]) > 0){
                   currVal = this.data[i];
                   this.data[i] = this.data[i + 1];
                   this.data[i + 1] = currVal;
                   haveChanges = 1;
               }
           }
           right--;

           for(int i = right; i>left;i--){
               if(comparator.compare(this.data[i-1], this.data[i]) > 0){
                   currVal = this.data[i];
                   this.data[i] = this.data[i-1];
                   this.data[i-1] = currVal;
                   haveChanges = 1;
               }
           }
           left++;
       } while ((left < right) && haveChanges == 1);
   }

    @Override
    public String toString() {
        return "DataContainer{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
