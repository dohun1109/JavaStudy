package Baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class num8959_OX퀴즈 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int Case = Integer.parseInt(br.readLine());

        for (int i = 0; i < Case; i++) {
            String testCase = String.valueOf(br.readLine());
            int count = 0;
            int sum = 0;

            for (byte val : testCase.getBytes()) {
                if ((char)val == 'O'){
                    count++;
                    sum += count;
                } else if ((char)val == 'X') {
                    count = 0;
                }
            }

            System.out.println(sum);
        }


    }

}
