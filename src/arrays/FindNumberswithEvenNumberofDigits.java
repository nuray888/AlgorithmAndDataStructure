package arrays;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] arr = {12, 234, 7627, 1, 23,78,6,77};
        System.out.println(search(arr));
        System.out.println(search2(arr));
        System.out.println(search3(arr));

    }
//Solution1
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
    static int search2(int[] arr) {
        int answer=0;
        for (int i = 0; i < arr.length; i++) {
            int count=string(arr[i]);
            if(even(count)){
                answer++;
            }
        }
        return answer;
    }

    static int search3(int[] arr) {
        int answer=0;
        for (int num:arr) {
            int count=math(num);
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
    //Solution2

    static int string(int num){
        String s = String.valueOf(num);
        return s.length();
    }

    //Solution3
    static int math(int num){
      return (int)(Math.log10(num)+1);

    }
}
