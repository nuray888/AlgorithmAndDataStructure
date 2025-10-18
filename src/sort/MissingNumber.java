package sort;

import java.util.Arrays;
//https://leetcode.com/problems/missing-number/description/

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr={0,4,2,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findingMissingNumber(arr));
    }
    static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i];
            //? [0,1,2,4] if range is [0,4] then here we ignore the number of 4's statement
            if(arr[i]<arr.length && arr[i]!=arr[correctIndex]){

                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }

    }

    static int findingMissingNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
}
