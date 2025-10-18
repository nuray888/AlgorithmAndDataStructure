package learning.recursion;

public class CountZeroes {
    public static void main(String[] args) {
        countZeroes(877270000);
    }
    static void countZeroes(int n) {
        System.out.println(helper(n, 0));
    }
    static int helper(int n, int c) {
        if(n == 0){
            return c;
        }
        if(n%10 == 0){
            return helper(n/10,c+1);
        }else{
            return helper(n/10,c);
        }
    }
}
