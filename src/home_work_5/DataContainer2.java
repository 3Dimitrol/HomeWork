package home_work_5;

public class DataContainer2 {
    private Integer[] data;   // Поле
    public DataContainer2(Integer[] arr){     // Конструктор
        this.data = copyOf(arr, arr.length);

    }

    public  int add(Integer item){    // Метод add

        if(item == null){
            return -1;
        }

        int indexForInsert = -1;                       // Поиск null
        for (int i = 0; i < this.data.length; i++) {
            if(this.data[i] == null){
                indexForInsert = i;
                break;
            }
        }

        if(indexForInsert == -1) {

            indexForInsert = this.data.length;

            this.data = copyOf(this.data, this.data.length + 1);  // Создаём новый массив с исходными данными старого и увеличиваем его размер
        }
            this.data[indexForInsert] = item;  // Записываем переданное значени в массив
            return indexForInsert;            // Возвращаем номер ячейки
    }

    public Integer get(int index){

        if(!checkExistIndexArray(this.data, index)){
            return null;
        }

        return this.data[index];
    }

    public Integer[] getItems(){
       return copyOf(this.data, this.data.length);
    }

    public  boolean delete(int index){
        if(!checkExistIndexArray(this.data, index)){
            return false;
        }

        for(int i = index + 1; i < this.data.length;i++){
            this.data[i - 1] = this.data[i];
        }

        this.data[this.data.length - 1] = null;  // Замена ячейки в массиве

        // this.data = copyOf(this.data, this.data.length - 1);  // Удаление ячейки из массива

        return true;
    }


    public  boolean delete(Integer item){

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

    private boolean checkExistIndexArray(Integer[] arr, int index){
         return index <= arr.length && index >= 0;
    }


    private Integer[] copyOf(Integer[] arr, int newLegth){

        Integer[] tmp = new Integer[newLegth];

        for (int i = 0; i < tmp.length && i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        return tmp;
    }

    public void sort(){
        int left = 0;
        int right = this.data.length - 1;
        int currVal;
        int haveChanges;

        do{
            haveChanges = 0;
            for (int i = left; i<right; i++){
                if(this.data[i] > this.data[i + 1]){
                    currVal = this.data[i];
                    this.data[i] = this.data[i + 1];
                    this.data[i + 1] = currVal;
                    haveChanges = 1;
                }
            }
            right--;

            for(int i = right; i>left;i--){
                if(this.data[i-1] > this.data[i]){
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
