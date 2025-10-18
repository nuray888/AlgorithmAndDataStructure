package learning.bitwise;
public class FindUnique2 {
    public static void main(String[] args) {
//        int[] arr={2,2,3,2,7,7,8,7,8,8};
        int[] arr = {5, 5, 5, 7, 3, 3, 3};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] arr){
        int sum=0;
        for(int a:arr){
            sum+=Integer.parseInt(Integer.toBinaryString(a));
        }
        return sum % 3;
    }
}
