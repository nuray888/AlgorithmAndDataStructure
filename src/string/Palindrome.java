package string;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palindrome("race a car"));//raceecar
        System.out.println(palindrome("A man, a plan, a canal: Panama"));

    }

    static boolean palindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        boolean palindrome=false;
        s=s.toLowerCase();
        s=s.replace(" ","");
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }else {
                palindrome=true;
            }
        }
        return palindrome;
    }


}
