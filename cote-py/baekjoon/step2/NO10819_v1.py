import sys

n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
result = -1e9
visited = [False] * n


def calculate(level, temp_arr):
    global result
    if level == n:
        temp = 0
        for i in range(n - 1):
            temp += abs(temp_arr[i] - temp_arr[i + 1])
        result = max(result, temp)
        return
    for cur in range(n):
        if not visited[cur]:
            visited[cur] = True
            temp_arr.append(arr[cur])
            calculate(level + 1, temp_arr)
            temp_arr.pop()
            visited[cur] = False


calculate(0, [])

print(result)