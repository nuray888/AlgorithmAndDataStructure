package sort;
//https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindDuplicate {
    public static void main(String[] args) {
//nums = [1,3,4,2,2]
        int[] arr={1,3,4,2,2};
        System.out.println(sort(arr));
    }
    static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }
        //finding duplicate
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
               return arr[j];
            }
        }
        return -1;
    }
}
