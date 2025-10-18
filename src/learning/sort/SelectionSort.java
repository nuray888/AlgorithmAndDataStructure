package learning.sort;

import java.util.Arrays;
//! Maksimum eded secib onu en sona atiriq. Daha sonrasinda maksimum tapilanda en sonuncu yeri nezere almiriq bir evvelkini
//! nezere aliriq bu sekilde devam edir best case O(n^2)  worst case O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={10,12,4,7,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int maxIndex=max(arr,0,last);
            swap(arr,last,maxIndex);

        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
    static int max(int[] arr,int start,int last){
        int max=start;
        for (int i = start; i <=last; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
