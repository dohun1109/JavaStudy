package Baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class silver11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sToken = new StringTokenizer(buf.readLine());

        int numNo = Integer.parseInt(sToken.nextToken());
        int quizNo = Integer.parseInt(sToken.nextToken());

        long[] S = new long[numNo + 1];
        sToken = new StringTokenizer(buf.readLine());
        for (int i = 1; i <= numNo; i++) {
            S[i] = S[i-1] + Integer.parseInt(sToken.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {
            sToken = new StringTokenizer(buf.readLine());
            int i =  Integer.parseInt(sToken.nextToken());
            int j = Integer.parseInt(sToken.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
