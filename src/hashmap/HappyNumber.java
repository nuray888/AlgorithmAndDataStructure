package hashmap;

//https://leetcode.com/problems/happy-number/
public class HappyNumber {

//    Starting with any positive integer, replace the number by the sum of the squares of its digits.
//    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//    Those numbers for which this process ends in 1 are happy.
//    Return true if n is a happy number, and false if not.


    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    static int process(int n) {
        if (n <= 0) {
            return 0;
        }
        return (int) (Math.pow(n % 10, 2) + process(n / 10));
    }
    static boolean isHappy(int n) {
        while(process(n) != 1) {
            n = process(n);
        }
        return true;
    }

}
