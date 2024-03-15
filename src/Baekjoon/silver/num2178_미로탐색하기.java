package Baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class num2178_미로탐색하기 {

    /**
     * - 11724_연결 요소의 개수 - O
     * - 2023_신기한 소수
     * - 13023_ABCDE
     * - 1260_DFS와 BFS - O
     * - 2178_미로 탐색 - O
     * - 1967_트리의 지름
     */

    
    //BFS 실행 -> BFS 로 탐색시 해당 Node 찾는 경우 depth(깊이) 가 항상 최소값
    //DFS 의 경우 -> 탐색시 depth 를 계속 가지고 다니며(방문한 곳이여서 빠저나갈때는 depth -1 ) 해당 Node 를 찾을때 마다 최소값과 도착할때 걸린 depth 값을 비교해서 해야함으로 구현이 상대적으로 어렵다.

    // dx, dy (상하좌우를 탐색하기 위한 define 값 정의 변수)
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    // (0, 1) , (1, 0) , (0, -1), (-1, 0)
    // 오른쪽, 위, 왼, 아래 
    static boolean[][] visited;
    static int[][] A;
    static int N, M;
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j + 1)); //j 부터 시작해서 j+1 전까지
            }
        }
        BFS(0,0);
        //BFS 실행 -> BFS 로 탐색시 해당 Node 찾는 경우 depth(깊이) 가 항상 최소값
        System.out.println(A[N-1][M-1]);    //index 가 1부터 시작함으로 -1

        
        

    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int k = 0; k < 4; k++) {   //상하좌우로 탐색 
                int y = now[0] + dy[k];
                int x = now[1] + dx[k];

                if (x >= 0 && y >= 0 && y < N && x < M) {   //좌표가 유한지 검사( 배열 index 를 넘어가면 안됨)
                    if (A[y][x] != 0 && !visited[y][x]){    //0 이여서 갈수 없거나, 방문한 곳이면 안됨.
                         // 이제 갈수 있는 곳
                        visited[y][x] = true;
                        A[y][x] = A[now[0]][now[1]] +1; // 핵심 -> 방문한 곳에 데이터를 0 이아닌 depth(깊이)로 변경
                        queue.add(new int[]{y,x});
                    }
                }                                              
            }
        }


    }


}
