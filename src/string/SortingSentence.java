package string;

public class SortingSentence {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sort(s));


    }




//    Input: s = "is2 sentence4 This1 a3"
//    Output: "This is a sentence"


    static String sort(String str){
        String sortedSentence="";
        int count=1;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == (char)(count + '0')){

                int j=i;

                while(j>=0 && str.charAt(j)!=' '){
                    j--;
                }

                sortedSentence += str.substring(j+1,i) + " ";
                count++;
                i=-1; // yenidən axtarmaq üçün
            }
        }

        return sortedSentence.trim();
    }
}
