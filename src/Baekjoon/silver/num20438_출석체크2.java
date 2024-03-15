package Baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class num20438_출석체크2 {
    /*  10 1 3 1
     *   7
     *   3 5 7
     *   3 12
     *   -> 4
     *
     *   50 4 5 1
     *   24 15 27 43
     *   3 4 6 20 25
     *   3 52
     *   -> 25
     */


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = readLineToken(br); // 1 line

        int student_Num = IntegerToken(st);   //student_Num -> N
        int sleep_Num = IntegerToken(st);   //sleep_Num -> K
        int Request_Num = IntegerToken(st);   //Request_Num  -> Q
        int prefix_Time = IntegerToken(st);   //prefix_Time -> M

        boolean[] Original_Arr = new boolean[student_Num + 3];  //원본 배열 | 초기값 -> false


        List<Integer> Sleep_Student = new ArrayList<>();

        st = readLineToken(br); //2 line


        for (int i = 0; i < sleep_Num; i++) {   //sleep_Num 만큼 Sleep_Student  에 저장
            Sleep_Student.add(IntegerToken(st));
        }



        st = readLineToken(br); //3 line
        for (int i = 1; i < Request_Num+1; i++) { //초기 출석 요청 학생
            int Request_Student = IntegerToken(st);
            if (Sleep_Student.contains(Request_Student)) continue;  //자는 사람중에 <출석요청받은 사람>이 있으면 넘어감.
            
            int add = Request_Student;  //Original_Arr_Index
            while ((add <= student_Num + 2)) { // 요청한 사람의 출석번호가 false 면 (초기값 false)
                if ((add % Request_Student == 0)&& !Sleep_Student.contains(add)) { //출석 번호로 나눴을 때 0 -> 배수
                    Original_Arr[add] = true; //출석 체크
                }
                add++;
            }

        }


        int[] prefix_Sum = new int[student_Num + 3];    //합 배열  
        for (int i = 3; i < prefix_Sum.length; i++) {
            prefix_Sum[i] = prefix_Sum[i - 1] + ((!Original_Arr[i] ? 1 : 0));   //합 배열 S[i] = S[i-1] +A[i]
        }

        for (int i = 0; i < prefix_Time; i++) {
            st = readLineToken(br);
            int S = IntegerToken(st);
            int E = IntegerToken(st);
            System.out.println(prefix_Sum[E] - prefix_Sum[S - 1]);  //구간합 S[j] - S[i - 1]
        }
        

    }

    public static Integer IntegerToken(StringTokenizer stringTokenizer) {   //
        return Integer.parseInt(stringTokenizer.nextToken());
    }

    public static StringTokenizer readLineToken(BufferedReader br) throws IOException {
        return new StringTokenizer(br.readLine());
    }


}
