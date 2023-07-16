import sys

n, m = map(int, sys.stdin.readline().split())
board = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
visited = [[False] * m for _ in range(n)]
answer = 0
max_value = max(map(max, board))

# 상하좌우
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]


def calculate(level, total, y, x):
    global answer
    if answer >= total + (3-level) * max_value:
        return
    if level == 3:
        answer = max(answer, total)
        return
    for d in range(4):
        ny = y + dy[d]
        nx = x + dx[d]

        if 0 <= ny < n and 0 <= nx < m and not visited[ny][nx]:
            if level == 1:
                visited[ny][nx] = True
                calculate(level + 1, total + board[ny][nx], y, x)
                visited[ny][nx] = False
            visited[ny][nx] = True
            calculate(level + 1, total + board[ny][nx], ny, nx)
            visited[ny][nx] = False


for i in range(n):
    for j in range(m):
        visited[i][j] = True
        calculate(0, board[i][j], i, j)
        visited[i][j] = False

print(answer)