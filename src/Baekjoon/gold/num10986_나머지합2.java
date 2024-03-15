package Baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num10986_나머지합2 {

    /*
        N 개의 수가 주어진다 . (A1 ~ An)
        연속된 부분 구간의 합이 M 으로 나누어 떨어지는  구간의 개수를 구하시오.
        즉, prefix % M = 0 인 구간의 개수
        Ai + ... + Aj (i <= j) 의 합이 M 으로 나누어 떨어지는 (i, j) 쌍의 개수 
        i = j 구간이 있을 수 잇고 i = 0 인 구간이 존재할 수 있다.

        1line -> N(수의 개수) , M (1 <= N <= 10^6, 2<= M <= 10^3)

        2line -> N 개의 수 (A1, A2 ... , An) (0 <= Ai <= 10^9)
        <시간 제한 1초>
        output -> 해당 구간의 개수   
     */

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 수의 개수
        int M = Integer.parseInt(st.nextToken());   // M

        long[] prefix_sum = new long[N + 1];        // (누적합 %M)  저장  합배열 -> ( S[i]%3 ) 합배열
        long[] cnt = new long[M];  // 값이 같은 나머지값  저장
        long reuslt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N+1; i++) {

            int A = Integer.parseInt(st.nextToken());   //n 개의 수중 Ai
            prefix_sum[i] = (prefix_sum[i-1] + A) % M;

            if (prefix_sum[i] == 0){    // 값이 0 이라는 건 이미 특정 원래 합배열(S[i]) 범위 자체가 특정 (i, j) 쌍이라는 뜻이라서 + -> 0~i 까지의 합이 M으로 나눈 나머지가 0인 경우의 수
                reuslt++;
            }
            
            //나머지가 같은 인덱스 수 +
            cnt[(int) prefix_sum[i]]++;
            
        }

        for (int i = 0; i < M; i++) { //합배열 중에 S[j]%M = S[i-1]%M 을 만족하는 (i,j) 쌍
            if (cnt[i] > 1) {
                reuslt += ((cnt[i] * (cnt[i] - 1)) / 2);
            }
        }

        System.out.println(reuslt);


    }

}
