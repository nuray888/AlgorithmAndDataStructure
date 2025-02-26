package learning.binarysearch;
//https://leetcode.com/problems/binary-search/description/
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr={12,13,16,28,67,100};
        int target=16;

        System.out.println(binary(arr,target));

    }
//*  return -1 if it is not exist

    static int binary(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //! We cannot write that because (start+end) can exceed range of int
            //? int mid=(start+end)/2;
            int mid=start + (end-start)/2;//! If you check that it is actually the same thing (start+end)/2

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }

        }

        return -1;

    }
}
