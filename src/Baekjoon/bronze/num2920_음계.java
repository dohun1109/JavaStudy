package Baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num2920_음계 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] input = new int[8];
        for (int i = 0; i < 8; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        int sum = Check(input);
        if (sum == 7){
            System.out.println("ascending");
        } else if (sum == -7) {
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }


    }
    public static int Check(int[] input){

        int sum = 0;
        for (int i = 1; i < 8; i++) {
            int result = input[i] - input[i - 1];
            if (result == 1){
                sum++;
            } else if (result == -1) {
                sum--;
            }
        }
        return sum;
    }

}
