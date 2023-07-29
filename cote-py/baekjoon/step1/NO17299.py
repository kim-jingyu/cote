import sys

N = int(input())
arr = list(map(int, sys.stdin.readline().split()))
answer = [-1] * N
stack = []
temp = [0] * 1_000_001

for i in range(0, N):
    temp[arr[i]] += 1

for i in range(N):
    while stack and temp[arr[stack[-1]]] < temp[arr[i]]:
        answer[stack.pop()] = arr[i]

    stack.append(i)

print(*answer)
