package Baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2675문자열반복 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();


        int T = Integer.parseInt(st.nextToken());   //테스트 케이스의 개수



        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(bf.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = String.valueOf(st.nextToken());

            for (byte val : S.getBytes()) {
                for (int k = 0; k < R; k++) {
                    sb.append((char) val);
                }
            }
            sb.append('\n');
        }

        System.out.print(sb);

    }
}
