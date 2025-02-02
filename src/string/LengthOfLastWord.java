package string;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        //! We use this method for to get rid of empty string that at the end and at the beginning
        s =s.trim();
        int count = 0; //we count the length of the last word
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
        //* Space complexity and Time complexity O(n)
    }
}
