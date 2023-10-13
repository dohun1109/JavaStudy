package Baekjoon.silver;

import java.util.ArrayList;
import java.util.Scanner;

public class num1312 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();


        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            arr.add(a / b);
            a = a%b*10;
            if (arr.size() == n+1){
                break;
            }
        }
        
        System.out.println(arr.get(n));

        

    }
}
