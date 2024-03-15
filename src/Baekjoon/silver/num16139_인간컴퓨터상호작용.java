package Baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num16139_인간컴퓨터상호작용 {

    public static void main(String[] args) throws IOException {


        /*  '문자열에서 특정 알파벳이 몇 번 나타나는지 알아보기
        *   특정 문자열 S, 특정 알파벳 a 와 문자열 구간 [l, r]이 주어지면 S의 l번째 문자부터 r번째
        *   문자 사이에 a가 몇 번 나타나는지 (문자열은 0번째 부터 세며, l 번째와 r번째 문자를 포함해서 생각한다
        *   * 같은 문자열을 두고 질문을 q번 할 것이다.
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //문자열 S
        String S = br.readLine();
        int q = Integer.parseInt(br.readLine());

        //누적합 저장되는 배열 [S.length][q] -> 특정 문자 alpha 에 대해 문자열 S 에서 몇 번 나타나는지 누적합
        int[][] prefix_sum = new int[S.length()+1][26];  // 알파벳의 개수 26개

        for (int i = 0; i < S.length(); i++) {  //문자열의 길이 만큼 반복함. i = char index
            int S_char = S.charAt(i) - 97;        //문자열을 하나씩 받아서 누적합 원본 값(a = 97)
            for (int j = 0; j < prefix_sum[i].length; j++) {    //j 는 알파벳 index(a~z)
                // 누적합 저장
                prefix_sum[i+1][j] = prefix_sum[i][j] + (S_char == j ? 1: 0);
                //즉, 들어올 q값 에 대해서 미리 2차원 배열로 구성하고 해당 (문자 == alpha) 경우에 대해서 1 과 0으로
                // 누적합 저장 -> 즉, alpha 값이 들어오면 해당 2차원 배열에서 꺼내서 사용하면 됨.
            }
        }


        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < q; i++) {   // 구간 횟수만큼 반복
            st = new StringTokenizer(br.readLine());

            int alpha = st.nextToken().charAt(0) - 97;

            // 실제 배열의 구간 계산을 위해 +1 씩     0~5 -> 6-0
            int a = Integer.parseInt(st.nextToken())+1;
            int b = Integer.parseInt(st.nextToken())+1;

            //구간합
            sb.append(prefix_sum[b][alpha] - prefix_sum[a-1][alpha]).append("\n");

        }
        System.out.println(sb);



    }


}
