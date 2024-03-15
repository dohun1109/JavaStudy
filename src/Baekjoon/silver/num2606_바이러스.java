package Baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class num2606_바이러스 {

    static ArrayList<Integer>[] A;      //그래프 데이터 저장 인접리스트
    static boolean[] visited;           // 방문 기록 저장 배열
    static int count = 0;              // 1번 제외 -1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());    //노드의 수
        int M = Integer.parseInt(br.readLine());    //간선의 수

        visited = new boolean[N + 1]; //1번 index 부터 사용
        A = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<Integer>();    // A 인접 리스트의 각 ArrayList 초기화
        }

        for (int i = 0; i < M; i++) {   //M 개의 데이터만큼 반복해서
            //A 인접 리스트에 데이터 저장
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            // 양방향 연결 리스트임으로 각각의 인접 노드의 주소를 서로 저장
            A[s].add(e);
            A[e].add(s);
        }



        for (int i = 1; i < N + 1; i++) {   //1번 컴퓨터부터 DPS
            if (!visited[i]){   //모든 노드 탐색 완료. 즉, 새로운 노드 탐색할때
                DFS(i);
                System.out.println(count-1);   //1번은 제외
                break;
            }
        }


    }

    private static void DFS(int v) {
        if (visited[v]){    // 현재 노드가 == 방문노드이면 stop
            return;
        }
        visited[v] = true;  //visited 배열에 현재 노드 방문 기록
        count++;
        for (int i : A[v]){ //현재 노드의 연결 노드 중
            if (!visited[i]){    //방문하지 않은 노드가 있으면 탐색
                DFS(i);
            }
        }

    }
}
