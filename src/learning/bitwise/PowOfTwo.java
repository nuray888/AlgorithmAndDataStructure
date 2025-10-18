package learning.bitwise;

public class PowOfTwo {
    public static void main(String[] args) {
        int num=0;

        boolean ans=(num&(num-1))==0;
        if(num==0){
            ans=false;
        }
        System.out.println(ans);
    }
}
