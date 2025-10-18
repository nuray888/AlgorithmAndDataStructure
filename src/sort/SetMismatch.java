package sort;


import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        //nums = [1,2,2,4]
        int[] nums={1,2,2,4};
        System.out.println(Arrays.toString(cycleSort(nums)));

    }
    static int[] cycleSort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }else{
                i++;
            }
        }
        int[] ans=new int[2];
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                ans[0]=nums[index];
                ans[1]=index+1;
            }

        }
        return ans;

    }
}
