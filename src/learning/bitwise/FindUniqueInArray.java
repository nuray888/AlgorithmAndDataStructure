package learning.bitwise;
//! time complexity O(N)
//! space complexity O(1)
public class FindUniqueInArray {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int unique=0;
        for (int i = 0; i < arr.length; i++) {
            unique^=arr[i];

        }
        return unique;
    }


}
