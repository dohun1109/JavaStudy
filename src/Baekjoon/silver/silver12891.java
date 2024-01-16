package Baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class silver12891 {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));   //버퍼를 걸어 한줄을 저장해놓고
        StringTokenizer st = new StringTokenizer(bf.readLine());    //읽어온 한줄을 한 글자씩 나눠놓고

        int S = Integer.parseInt(st.nextToken());   //나눠놓은 글자를 하나씩 다음꺼를 가져오기(임의의 DNA 문자열 길이) 생성할 배열의 크기로 사용
        int P = Integer.parseInt(st.nextToken());   //비밀번호로 사용할 부분문자열 길이
        int result = 0;                             // 결과
        int checkArr[] = new int[4];
        int myArr[] = new int[4];
        char[] A = new char[S];
        int checkSecret = 0;

        A = bf.readLine().toCharArray();    //다음줄 A배열에 임의의 DNA 문자열 데이터 저장
        st = new StringTokenizer(bf.readLine());    //다음줄 요기는 
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }


        
        



    }


}
