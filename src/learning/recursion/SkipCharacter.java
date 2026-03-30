package learning.recursion;
//! skip character 'a' in string
public class SkipCharacter {
    public static void main(String[] args) {
        //? neticede up="bcdefg" olmalidi
        String str = "abcdeappleafag";
        System.out.println(skipWord(str));

    }

    public static String skipCharacter(String p,String up){
        if(up.isEmpty()){
            return p;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skipCharacter(p,up.substring(1));
        }
        return skipCharacter(p+ch,up.substring(1));
    }

    public static String skipCharacter2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skipCharacter2(up.substring(1));
        }
        return ch+skipCharacter2(up.substring(1));
    }


    //! skipWord
    public static String skipWord(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple")){
            return skipWord(up.substring(5));
        }else{
            return ch+ skipWord(up.substring(1));
        }

    }
}
