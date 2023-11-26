package Baekjoon.bronze;


import java.util.Scanner;

public class bronze11720 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // n = 입력받을 숫자의 개수 num = 입력 받은 숫자(공백없이 넘어옴)
        int n = scan.nextInt();
        String snum = scan.next();

        char[] numArr = snum.toCharArray();
        int sum = 0;
        for(char num : numArr){
            sum += num -48;
        }

        System.out.println(sum);
        
        


    }
}
