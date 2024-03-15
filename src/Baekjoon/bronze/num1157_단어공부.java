package Baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1157_단어공부 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[26];    //영문자의 개수는 26개
        String S = st.nextToken();

        for (byte c : S.getBytes()) {

            char Char = (char) c;
            if (Char < 91) {
                arr[Char - 65]++;
            } else {
                arr[Char - 97]++;
            }
        }
        int MAX = Integer.MIN_VALUE;
        int ch = -2;        // ? 는 63 이다.

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > MAX){
                MAX = arr[i];
                ch = i;
            } else if (arr[i] == MAX) {
                ch = -2;
            }
        }

        System.out.println((char)(ch+65));  //결과값은 대문자로 통일


    }

}
