package Baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num11724_연결요소의개수 {

    static ArrayList<Integer>[] A;  //그래프 데이터 저장 인접 리스트
    static boolean[] visited;       //방문 기록 저장 배열
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());       //노드 개수
        int M = Integer.parseInt(st.nextToken());       //간선 개수
        visited = new boolean[N+1]; //1번 index 부터 사용
        A = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<Integer>();    //A 인접 리스트의 각 ArrayList 초기화
        }

        for (int i = 0; i < M; i++) {   //M 의 개수 만큼 반복
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e =  Integer.parseInt(st.nextToken());
            A[s].add(e);        //A 인접 리스트에 그래프 데이터 저장
            A[e].add(s);
        }
        int count = 0;
        for (int i = 1; i < N+1; i++) {
            if (!visited[i]) {  //방문하지 않은 노드  
                count++;
                DFS(i);        //DFS 실행
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {

        if (visited[v]){  //현재 노드 == 방문노드 면 stop
            return;
        }
        visited[v] = true;  //visited 배열에 현재 노드 방문 기록
        for (int i :A[v]){  //현재 노드의 연결 노드 중 방문하지 않은 노드가 있으면 탐색
            if (!visited[i]){
                DFS(i);
            }
        }

    }


}
