package Baekjoon.bronze;

import java.util.Scanner;

public class bronze1546 {

    public static void main(String[] args) {

        //최대값 M , 모든점수를 /M * 100
        //입력 시험 본 과목 n (n <= 1000) , 현재성적 차래대로 score

//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] A = new int[n];
//        for (int i = 0; i < A.length; i++) {
//            A[i] = scan.nextInt();
//        }
//
//
//        int sum = 0; //n개의 과목을 더하는데 long 자료형의 경우 268 ? 까지 밖에 안되기때문에 int 사용
//        long max = 0; //과목당 최대 점수는 100이하이기 때문에 long 사용함 (메모리낭비 최소화)
//        for (int score : A) {
//            if (score > max ){
//                max = score;
//            }
//            sum += score;
//        }
//
//        // ( a / M * 100 + b / M * 100 + c / M * 100) / n
//        // (a + b + c)/M*100/n => a + b + c = sum M = max n  = length
//        double result = (double)sum / max * 100.0/n;
//        System.out.println(result);


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0,max = 0;
        for (int i = 0; i < n; i++) {
            int temp = scan.nextInt();
            if( temp > max) max = temp;
            sum+= temp;
        }
        System.out.println(sum/(double)max*100.0/n);
    }


}
