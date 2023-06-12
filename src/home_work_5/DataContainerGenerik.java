package home_work_5;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerGenerik<T> {
    private T[] data;   // Поле
    public DataContainerGenerik(T[] arr){  // Конструктор
        this.data = copyOf(arr, arr.length);

    }

    public  int add(T item){

        if(item == null){   // Проверяем что передали не null
            return -1;
        }

        int indexForInsert = -1;
        for (int i = 0; i < this.data.length; i++) {  // Ищем ячейку с null
            if(this.data[i] == null){
                indexForInsert = i;   //если нашли, запоминаем номер ячейки
                break;
            }
        }

        if(indexForInsert == -1) {   // если не нашли, то создаём новый массив с исходными данными нащего массива и увеличенной длинной

            indexForInsert = this.data.length;

            this.data = copyOf(this.data, this.data.length + 1);  // Возврат нового массива в поле
        }
            this.data[indexForInsert] = item;  // Записываем переданное значени в массив
            return indexForInsert;  // вернуть номер ячейки
    }

    public T get(int index){  // метод возвращает число , находящееся в ячейки под номером item

        if(!checkExistIndexArray(this.data, index)){   // Проверка на то что переданное значени больше нуля и меньше длинны массива
            return null;
        }

        return this.data[index];  // вернуть значение в ячейке
    }

    public T[] getItems(){
       return copyOf(this.data, this.data.length);  // Передаёт массив из поля
    }

    public  boolean delete(int index){
        if(!checkExistIndexArray(this.data, index)){   // Проверка на то что переданное значени больше нуля и меньше длинны массива
            return false;
        }
        for(int i = index + 1; i < this.data.length;i++){   //
            this.data[i - 1] = this.data[i];
        }
        this.data[this.data.length - 1] = null;  // Замена ячейки в массиве

        // this.data = copyOf(this.data, this.data.length - 1);  // Удаление ячейки из массива
        return true;
    }


    public  boolean delete(T item){

        if(item == null){
            return false;
        }

        for(int i = 0; i < this.data.length;i++){
            if(item.equals(this.data[i])){
                return delete(i);
            }
        }
        return true;
    }

    private boolean checkExistIndexArray(T[] arr, int index){
         return index <= arr.length && index >= 0;
    }


    private T[] copyOf(T[] arr, int newLegth){

        return Arrays.copyOf(arr, newLegth);
    }

    public void sort(Comparator<T> comparator){
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

}
