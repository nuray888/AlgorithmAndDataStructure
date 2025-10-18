package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class NumberDissappearedInArray {
//    public static void main(String[] args) {
//        int[] arr={4,3,2,7,8,2,3,1};
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(find(arr));
////Input: nums = [4,3,2,7,8,2,3,1]
//        //1 2 2 3 3 4 7 8
////Output: [5,6]
//    }
//
//
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        int i = 0;
//        while (i < nums.length) {
//            int correctIndex = nums[i] - 1;
//            if (nums[i] != nums[correctIndex]) {
//                int temp = nums[i];
//                nums[i] = nums[correctIndex];
//                nums[correctIndex] = temp;
//            }else{
//                i++;
//        }
//
//        List<Integer> list=new ArrayList<>();
//        for (int j = 0; j < nums.length; j++) {
//            if(nums[j]!=j+1){
//                list.add(j+1);
//            }
//        }
//        return list;
//
//    }
//
//    static List<Integer> find(int[] arr){
//        List<Integer> list=new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]!=i+1){
//                list.add(i+1);
//            }
//        }
//        return list;
//    }
//}
