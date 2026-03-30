package learning.sort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={3,1,2,5,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //?        1 2 3 4 5
        //?
        //?        0 1 2 3 4
//        cycleSort(arr);
//        System.out.println(Arrays.toString(arr));

    }
    static void  cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }

            i++;

        }
    }





















//    static void cycleSort(int[] arr){
//        int i=0;
//        while(i<arr.length){
//            int correctIndex=arr[i]-1;
//            if(arr[i]!=arr[correctIndex]){
//                int temp=arr[i];
//                arr[i]=arr[correctIndex];
//                arr[correctIndex]=temp;
//            }else{
//                i++;
//            }
//        }
//
//    }

}
