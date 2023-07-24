import sys

sys.setrecursionlimit(10 ** 6)
N, M = map(int, sys.stdin.readline().split())
board = [[0] * N for _ in range(N)]
visited = [False] * N
answer = 0

for _ in range(M):
    a, b = map(lambda value: value - 1, map(int, sys.stdin.readline().split()))
    board[a][b] = board[b][a] = 1


def calculate(cur):
    for nxt in range(N):
        if board[cur][nxt] == 1 and not visited[nxt]:
            visited[nxt] = True
            calculate(nxt)


for i in range(N):
    if not visited[i]:
        answer += 1
        visited[i] = True
        calculate(i)

print(answer)