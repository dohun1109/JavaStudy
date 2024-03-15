package Baekjoon.silver;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class num1260_DFS와BFS프로그램 {
    static ArrayList<Integer>[] A;  //그래프 데이터 저장 인접 리스트
    static boolean[] visited;           //방문 기록 저장 배열

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        A = new ArrayList[N + 1];


        for (int i = 1; i < N+1; i++) {  //A 인접 리스트의 각 ArrayList 초기화
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
            A[E].add(S);
        }


        for (int i = 1; i < N+1; i++) {   //방문할 수 있는 노드가 여러개일 경우에는 번호가 작은 것을 먼저 방문하기 위해 정렬
            Collections.sort(A[i]);
        }

        visited = new boolean[N + 1];
        DFS(start);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(start);
        System.out.println();
        




    }
    private static void DFS(int Node) {
        if (visited[Node]){    // 현재 노드가 == 방문노드이면 stop
            return;
        }
        System.out.print(Node+" ");
        visited[Node] = true;

        for (int i : A[Node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    private static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(Node);
        visited[Node] = true;

        
        while (!queue.isEmpty()) {
            int now_Node = queue.poll();    //Queue 에 들어온에중 첫번재에 있는애 뽑기 
            System.out.print(now_Node+" "); //방문된 Node 임으로 출력 
            for (int i : A[now_Node]){      // 갈 수 있는 인접 노드 탐색 
                if (!visited[i]) {   // 방문이 안된 노드 찾기
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        
    }



}
