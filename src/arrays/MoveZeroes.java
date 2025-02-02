package arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        // [0,1,0,3,12]
        int L=0;  //* Left pointer
        int R=1;  //* Right pointer
        while(R<nums.length){
            if(nums[L]!=0){
                L++;
                R++;
            }
            else if(nums[R]==0){
                R++;
            }
            else{
                int temp=nums[L];
                nums[L]=nums[R];
                nums[R]=temp;
            }
        }
        //! Time complexity : O(n)
        //! Space complexity :O(1)




    }
}
