from collections import deque

def solution(n, edge):
    answer = 0

    # ====선언====

    # 인접 리스트 생성
    graph = [ [] for _ in range(n+1) ]
    # 인접 리스트 채우기
    for nodes in edge:
        graph[nodes[0]].append(nodes[1])
        graph[nodes[1]].append(nodes[0])

    # 각 노드의 최단거리
    distance = [-1] * (n+1)
    # 첫 번째 노드 최단거리 초기화
    distance[1] = 0 

    # ====bfs====

    # 출발지점 queue에 넣기
    queue = deque([1])

    while queue:
        now = queue.popleft()

        for next in graph[now]:
            if distance[next] == -1: # 아직 방문하지 않은 노드면
                queue.append(next)
                distance[next] = distance[now] + 1

    for i in distance:
        if i == max(distance):
            answer += 1

    return answer

# 간선에 대한 정보
vertex = [
    [3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]
]

print(solution(6, vertex))