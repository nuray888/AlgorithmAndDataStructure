package sort;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

public class AllDuplicatesInArray {
    public static void main(String[] args) {


//nums = [4,3,2,7,8,2,3,1]
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(cycleSort(nums));
    }

    static List<Integer> cycleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        //finding answers
        List<Integer> list=new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                list.add(nums[j]);
            }

        }
        return list;
    }
}
