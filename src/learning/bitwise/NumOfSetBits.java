package learning.bitwise;

public class NumOfSetBits {
    public static void main(String[] args) {
        int num=9;
        int counter=0;
        while(num>0){
            if((num & 1)==1){
                counter++;
            }
            num=num>>1;
        }
        System.out.println(counter);
    }
}
