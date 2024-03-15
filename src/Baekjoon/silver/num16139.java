package Baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class num16139 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int count = Integer.parseInt(br.readLine());
        List<Character> S_arr = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            S_arr.add(S.charAt(i));
        }

        StringTokenizer st;
        int[] arr = new int[S.length()+1];
        StringBuilder sb = new StringBuilder();



        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            Arrays.fill(arr,0);
            char charAt = st.nextToken().charAt(0);
            int prefix1 = Integer.parseInt(st.nextToken());
            int prefix2 = Integer.parseInt(st.nextToken());

            for (int j = 0; j < S.length(); j++) {
                arr[j+1] = arr[j] + (S_arr.get(j) == (Character) charAt ? 1 : 0);
            }
            
            prefix1++;
            prefix2++;
            sb.append((arr[prefix2] - arr[prefix1-1]) );
            sb.append( "\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();


    }


}
