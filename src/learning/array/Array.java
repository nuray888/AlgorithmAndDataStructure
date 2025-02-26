package learning.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//
//        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
//
//        for (int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                list.get(i).add(sc.nextInt());
//
//            }
//        }
//
//        System.out.println(list);

        int[] arr={1,2,3};
        Arrays.stream(arr).forEach(num-> System.out.println(num+" "));

    }
}
