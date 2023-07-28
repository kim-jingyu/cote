import sys
N = int(input())
arr = list(map(int, sys.stdin.readline().split()))
P = [0] * 1001
for i in range(1, N + 1):
    P[i] = arr[i-1]
cached = [0] * 1001
cached[1] = P[1]

for i in range(1, N+1):
    cached[i] = P[i]
    for j in range(1, i):
        cached[i] = max(cached[j] + P[i-j], cached[i])

print(cached[N])