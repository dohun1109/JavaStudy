package Baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2475_검증수 {

    public static void main(String[] args) throws IOException {

        // 5자리 수 주어짐, 마지막에 검증수 = 5개 숫자 각각 제곱한 수의 합을 10으로 나눈 나머지
        // 검증 수를 출력해라

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            sum += num * num;
        }
        System.out.print(sum%10);


    }

}
