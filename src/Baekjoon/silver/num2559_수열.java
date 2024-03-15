package Baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class num2559_수열 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> arr1 = new ArrayList<>();      //원본 배열

        int N = Integer.parseInt(st.nextToken());    //온도 측정 일수
        int K = Integer.parseInt(st.nextToken());    //모든 연속적인 날의 수
        
        int[] arr2 = new int[N+1];
        st = new StringTokenizer(br.readLine());
        arr1.add(0);            //합 배열 구할때 1번 부터 하기위해서 하나 추가 
        while (st.hasMoreTokens()) {
            arr1.add(Integer.parseInt(st.nextToken()));
        }


        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i-1]+arr1.get(i);        //합배열 arr2  
        }

        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < N - K+1; i++) {          // N -K 피보나치 수열의 개수
            int prefix = arr2[i + K] - arr2[i];     // 구간합
            if (prefix >=Max){
                Max = prefix;
            }
        }


        System.out.println(Max);
    }
}
