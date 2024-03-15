package Baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class num10986_나머지합 {


    /*합 배열 (누적 합)
    S\[i] = A\[0] + A\[1] + ... + A\[i -1] + A\[i] // A\[0] 부터 A\[i] 까지의 합

    S\[i] = S\[i -1] + A\[i]   // 합 배열 공식

    구간 합
    S\[j] - S\[ i - 1 ]     // i 에서 j 까지 구간 합
     시간제한이 1초이다. 
    * */


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> arr1 = new ArrayList<>();      //원본 배열


        long N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        arr1.add(0);            //합 배열 구할때 1번 부터 하기위해서 하나 추가
        while (st.hasMoreTokens()) {
            arr1.add(Integer.parseInt(st.nextToken()));
        }

        long[] arr2 = new long[(int) (N + 1)];
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i - 1] + arr1.get(i);        //합배열 arr2
        }


        System.out.println(arr1);
        System.out.println(Arrays.toString(arr2));

        long time = N + 1;


        int K = 2;
        for (long i = 0; i < time- K + 1; i++) {
            System.out.println(arr2[(int) (i+K)] - arr2[(int) i]);

        }



    }


}
