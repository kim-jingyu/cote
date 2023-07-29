import sys
N = int(input())
arr = list(map(int, sys.stdin.readline().split()))
P = [0] * (N + 1)
for i in range(0, N):
    P[i+1] = arr[i]
cached = [0] * 1001

for i in range(1, N + 1):
    cached[i] = P[i]
    for j in range(1, i):
        cached[i] = min(cached[i], cached[j] + P[i-j])

print(cached[N])