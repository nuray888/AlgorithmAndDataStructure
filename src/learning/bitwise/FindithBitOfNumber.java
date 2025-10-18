package learning.bitwise;

public class FindithBitOfNumber {
    public static void main(String[] args) {
        int num=1011011;
        int bit=5;
        System.out.println(findBit(num,bit));
    }

    private static int findBit(int num,int bit) {
        return num & (1<<(bit-1));
    }


}
