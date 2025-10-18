package learning.bitwise;

public class MagicalNumber {
    public static void main(String[] args) {
        int num=4;
        int ans=0;
        int base=5;

        while(num>0){
            int last=num & 1;


            num=num  >> 1;
            ans+=last*base;

            base=base*5;
        }
        System.out.println(ans);
    }
}
