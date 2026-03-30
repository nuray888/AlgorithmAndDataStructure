package hashmap;

public class Anagram {
    //s = "anagram", t = "nagaram"
    public static void main(String[] args) {
        String s = "anagram";
        String t = "anaramg";
        for (int i = 0; i < s.length(); i++) {
            boolean tapildi=false;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    tapildi=true;
                    t.replace(t.charAt(j), ' ');
                    break;
                }
            }
            if(!tapildi){
                System.out.println("Anagram deyil");
                break;
            }
            if(i==s.length()-1){
                System.out.println("Anagramdir");
            }
        }

    }
}
