package learning.linearsearch;

public class StringSearch {

    public static void main(String[] args) {
        String name="Nuray";
        char target='q';
        System.out.println(search(name,target));
        System.out.println(search1(name,target));
    }

    static boolean search(String str,char target){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    static boolean search1(String str,char target){
        for(char c:str.toCharArray()){
            if(c==target){
                return true;
            }
        }
        return false;
    }
}


