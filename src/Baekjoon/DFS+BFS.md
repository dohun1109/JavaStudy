# DFS ( 깊이 우선 탐색)
    - DFS 는 기본적으로 스택 자료구조에 기초한다
    - 실제 구현시 재귀 함수를 이용했을 때 매우 간결하게 구현가능
    - 최대한 멀리있는 노드를 우선 탐색    
    
    -특징 
        - 시작 노드에서 출발하여 탐색할 한 쪽 분기를 정해서 최대깊이 까지 탐색을 마친 후 다른 쪽 분기로 이동한다.

    - 그래프를 표현하는 2가지 방법
        - 인접 행렬 : 2차원 배열에 그래프의 연결관계를 표현
        - 인접 리스트 : 리스트로 표현

    - 각 방법으로 DFS 탐색이 장단점 
        - 인접 행렬 -> 두 노드간의 연결 정보를 얻는 속도 상대적으로 빠름(인접 리스트 방식의 경우 연결된 데이터를 하나씩 확인해야하기 때문) 
        - 인접 리스트 -> 특정 노드와 연결된 모든 노드를 순회하는 경우 , 메모리 공간 낭비가 적다.

    - Stack자료구조에서 구체적인  DFS 동작과정
        1. 탐색 시작 노드를 스택에 삽입하고 방문 처리
        2. 스택의 최상단 노드에 방문하지 않은 인접 노드가 있으면 그 인접 노드를 스택에 넣고 방문 처리를 한다.(관행적으로 번호 낮은 순으로 처리) 방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼낸다.(LIFO)
        3. 1,2 과정을 더 이상 수행할 수 없을 때 까지 반복(재귀)

# BFS (넓이 우선 탐색)
    - 최대한 가까이 있는 노드부터 탐색 
    - FIFO 방식의 Queue 자료구조에 기초한다.
    
    - BFS 동작과정 
        1. 탐색 시작 노드를 큐에 삽입하고 방문처리
        2. 큐에서 노드를 꺼내 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리를 한다. 
        3. 2번의 과정을 더 이상 수행할 수 없을 때 까지 반복
    - 일반적인 경우 DFS보다 수행시간이 좋은편이다.

| 기능        | 특징                      | 시간복잡도 (노드수:V, 에지 수 : E) |
|-----------|-------------------------|-------------------------|
| 그래프 완전 탐색 | FIFO 탐색 , Queue 자료구조 이용 | O(V + E)                |
 
 - 너비 우선 탐색은 선입 선출 방식으로 탐새하므로 큐를 이용해 구현합니다. 또한 너비 우선 탐색은 탐새 시간 탐색 시작 노드와 가까운 노드를 우선하여 탐색하므로 목표 노드에 도착하는 경로가 여러 개일 때 최단 경로를 보장합니다. 이후 너비 우선 탐색은 BFS 라 부르겠습니다.


BFS 문제 풀이 방법 
1. **BFS 시작할 노드를 정한 후 사용할 자료구조 초기화하기** 
    -BFS DFS와 마찬가지로 방문했던 노드는 다시 방문하지 않으므로 방문한 노드를 체크하기 위한 배열이 필요합니다. 그래프를 리스트로 표현하는 것 역시 DFS와 동일합니다. 하나 차이점이 있다면 탐색을 위해 스택이 아닌 **큐**를 사용합니다.
    
    원본 그래프 -> 인접 리스트 -> 방문 배열 -> 큐 자료구조에 시작점을 더하기 
2. **큐에서 노드를 꺼낸 후 꺼낸 노드의 인접 노드를 다시 큐에 삽입하기**
    - 큐에서 노드르 꺼내면서 읹버 노드를 큐에 삽입합니다. 이때 방문 배열을 체크하여 이미 방문한 노드는 큐에 삽입하지 않습니다. 또한 큐에서 꺼낸 노드는 탐색 순서에 기록합니다.
3. **큐 자료구조에 값이 없을 때까지 반복하기**
    - 큐에 노드가 없을 때까지 앞선 과정을 반복합니다. 선입선출 방식으로 탐새하므로 탐색 순서가 DFS와 다름을 확인 










  









    