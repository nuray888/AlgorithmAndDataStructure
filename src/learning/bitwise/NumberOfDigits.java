package learning.bitwise;

public class NumberOfDigits {
    public static void main(String[] args) {
        int a = 6;
        //? First way
        String n = Integer.toBinaryString(6);
        System.out.println(n.length());
        System.out.println(count(a));

        //? Third way
        int b = 2;//base
        int ans = (int) (Math.log(a) / Math.log(b)) + 1;
        System.out.println(ans);
    }

    //? Second way
    private static int count(int a) {
        int counter = 0;
        while (a > 0) {
            a = a >> 1;
            counter++;
        }
        return counter;
    }


}
