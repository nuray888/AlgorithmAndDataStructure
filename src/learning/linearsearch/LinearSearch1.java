package learning.linearsearch;

public class LinearSearch1 {
    public static void main(String[] args) {

        int[] arr={2,4,27,1,38,29,90};
        int target=38;

        int answer=search(arr,target);
        System.out.println(answer);

    }


    public static int search(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
