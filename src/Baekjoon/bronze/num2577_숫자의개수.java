package Baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2577_숫자의개수 {

        static int[] result = new int[10];
    public static void main(String[] args) throws IOException {

        // A, B, C 가 주어질 때 A*B*C 계산한 결과에 0~9까지 몇 번씩 쓰였는지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        long sum = (long) Integer.parseInt(br.readLine()) *Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()) ;

        String sumCheck = String.valueOf(sum);
        Check(sumCheck);


        for (int count : result) {
            System.out.println(count);
        }
    }
    public static void Check(String num){
        for (byte c : num.getBytes()) {
            result[(int)c-48]++;
        }

    }

}
