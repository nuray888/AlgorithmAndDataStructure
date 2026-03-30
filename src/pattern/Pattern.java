package pattern;

public class Pattern {
    public static void main(String[] args) {
        pattern5(10);
    }




    static void pattern1(int n){
        for(int row=0;row<n;row++){
            for(int column=0;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println();

            }
    }
    static void pattern2(int n){
        for(int row=0;row<n;row++){
            for(int column=0;column<n-row-1;column++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int column=1;column<=row;column++){
                System.out.print(column +" ");
            }
            System.out.println();

        }
    }

    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            if(row<=n/2){
                for(int column=1;column<=row;column++){
                    System.out.print("* ");
                }
            }else{
                for(int column=0;column<n-row-1;column++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        //4 space n-row 4
        for(int row=1;row<=n;row++){
            if(row<=n/2){
                for(int column=1;column<=n/2-row;column++){
                    System.out.print(" ");
                }
                for(int column=1;column<=row;column++){
                    System.out.print("* ");
                }
            }else{
                int half=n/2;
                //half=5  row=6
                for(int column=1;column<row-half;column++){
                    System.out.print(" ");
                }
                for(int column=0;column<n-row;column++){
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }


}

