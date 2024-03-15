package Baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class num10809_알파벳찾기 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        String S = br.readLine();
        int count = 0;
        for (byte val : S.getBytes()) {
            if (arr[(char) val - 97] == -1) {
                arr[(char) val - 97] = count;
                count++;
            }else{
                count++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }


}
