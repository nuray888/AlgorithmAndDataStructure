package learning.slidingwindow;

public class LongestSubArray {
    public static void main(String[] args) {
       int[] arr={1,1,1,2,2,3,3,3,3};
        System.out.println(longestSubarray(arr));
    }
    public static int longestSubarray(int[] nums) {
        int length = 0;
        int L = 0;

        for (int R = 0; R < nums.length; R++) {
            if (nums[L] != nums[R]) {
                L = R;
            }
            length = Math.max(length, R - L + 1);
        }
        return length;
    }
}
