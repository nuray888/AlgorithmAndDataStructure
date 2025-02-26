package learning.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        Bubble(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void Bubble(int[] arr){
        boolean swapped=false;
        for (int i = 0; i <arr.length ; i++) {
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
