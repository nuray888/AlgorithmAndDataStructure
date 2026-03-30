package learning.recursion;

public class Print1ToN {
    public static void main(String[] args) {
        print1ToN(3);
        System.out.println();
    }

    static void print1ToN(int n) {
        //base condition
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }
}
