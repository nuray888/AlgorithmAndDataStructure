package arrays;
public class PlusOne {
    public int[] plusOne(int[] digits) {
        //* Case #1: The last digit is not 9. [4,5,6] Then we increment the last digit then return it
        //* Case #2: The last digit is 9. Starting counter at the end.If the current digit is 9
        //* then we set it to 0 if the current digit is not 9 we increment 1 and return it. [4,9,9] ->[5,0,0]
        //* Case #3: If the all digits are 9 then we need to create array that first element is 1
        //* and the others 0 [9,9,9,9]->[1,0,0,0,0]

        int currentDigit=digits.length-1;

        while(digits[currentDigit]==9){
            if(currentDigit==0){
                int[] newArray=new int[digits.length+1];
                newArray[0]=1;
                return newArray;
            }
            digits[currentDigit]=0;
            currentDigit--;
        }

        digits[currentDigit]++;
        return digits;

    }
    //! Time complexity O(n)
    //! Space Complexity O(n)
}
