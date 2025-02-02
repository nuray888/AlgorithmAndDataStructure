package arrays;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] arr = {12, 234, 7627, 1, 23,78,6};
        System.out.println(search(arr));

    }

    static boolean even(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;

    }

    static int search(int[] arr) {
        int answer=0;
        for (int i = 0; i < arr.length; i++) {
            int count=digit(arr[i]);
            if(even(count)){
                answer++;
            }

        }
        return answer;
    }

    static int digit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
