package Baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class num3052_나머지 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> num = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            num.add(Integer.parseInt(br.readLine()) % 42) ;
        }
        System.out.println(num.size());
    }
}
