package learning.linearsearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {28, 98, 1, 19};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }


        }
        return min;
    }

}
