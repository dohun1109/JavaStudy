package Baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num10250_ACM호텔 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int requestTime = Integer.parseInt(br.readLine());
        for (int i = 0; i < requestTime; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int order = Integer.parseInt(st.nextToken());
            int Y;
            int X;
            if (order % H == 0) {
                Y = H * 100;
                X = order/H;
            }else{
                Y = order % H * 100;
                X = (order/H) + 1;
            }
            System.out.println(Y + X);
        }

    }


}



