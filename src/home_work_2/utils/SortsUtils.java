package home_work_2.utils;

public class SortsUtils {
//Данный метод сортирует переданный ему массив при помощи алгоритма пузырьковая сортировка.
    public static int[] sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for(int k = arr.length - 1; k > i; k--){
                if (arr[k - 1] > arr[k]){
                    int rev = arr[k - 1];
                    arr[k - 1] = arr[k];
                    arr[k] = rev;
                }
            }
        }
        return arr;
    }

    //Данный метод сортирует переданный ему массив при помощи алгоритма шейкерная сортировка.
    public static int[] shake(int[] arr){

        int l = 0;
        int r = arr.length - 1;
        int s = 1;
        while ((l < r) && s > 0){
            s = 0;
            for (int i = l; i < r; i++) {
                if (arr[i] > arr[i + 1]){
                    int n = arr[i];
                    arr [i] = arr[i + 1];
                    arr[i + 1] = n;
                    s = 1;
                }
            }
            r--;
            for (int j = r; j > l ; j--) {
                if(arr[j - 1] > arr[j]){
                    int v = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = v;
                    s = 1;
                }
            }
            l++;
        }
        return arr;
    }
}
