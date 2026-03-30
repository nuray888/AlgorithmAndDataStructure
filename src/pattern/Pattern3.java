package pattern;

public class Pattern3 {
    //1-ci step: siralarin sayi = rowlarin sayi =outer loop
    //2-ci step: columnlarin sayi (rowlar ile elaqenin qurulmasi eger varsa
    //3-cu step: Ne print etmeliyik??
    /*

     *
    * *
   * * *
  * * * *
 * * * * *


     */
    static void pattern4(int n) {
        for (int row = 0; row < n; row++) {
            for (int column = 1; column <= n -row; column++) {
                System.out.print(" ");
            }
            for(int column=1;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern4(5);
    }


    //static void pattern1(int n){
//    for(int row=0;row<n;row++){
//        for(int column=0;column<=row;column++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//
//}



    }


