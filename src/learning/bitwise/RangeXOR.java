package learning.bitwise;

public class RangeXOR {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        // xor the same numbers will be zero and finally we get xor in the range of [a,b]
        int ans=xor(b) ^ xor(a-1);
    }


    //This will return XOR from 0 to a;
    static int xor(int a){

        if(a % 4==0){
            return a;
        }
        if(a % 4==1){
            return 1;
        }
        if(a % 4==2){
            return a+1;
        }
        return 0;

    }
}

