import sys

n = int(input())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
visited = [False] * n
answer = 1e9


def calculate(level, start, cur, temp_sum):
    global answer
    if level == n-1 and not arr[cur][start] == 0:
        temp_sum += arr[cur][start]
        answer = min(answer, temp_sum)
        return

    for i in range(n):
        if not visited[i] and not arr[cur][i] == 0 and temp_sum < answer:
            visited[i] = True
            calculate(level + 1, start, i, temp_sum + arr[cur][i])
            visited[i] = False


for i in range(n):
    visited[i] = True
    calculate(0, i, i, 0)
    visited[i] = False

print(answer)