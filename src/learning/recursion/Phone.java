package learning.recursion;

public class Phone {
    public static void main(String[] args) {
        phone("","12");
    }

    static void phone(String p,String up){
        //base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0'; //bu 1-i stringden integer 1 e cevirecek.

        for(int i=3*(digit-1);i<digit*3;i++){
            char ch=(char) ('a'+i);
            phone(p+ch,up.substring(1));
        }
    }
}
