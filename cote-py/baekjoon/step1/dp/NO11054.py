N = int(input())
arr = list(map(int, input().split()))

increased_dp = [1] * N
decreased_dp = [0] * N

for i in range(N):
    for j in range(i):
        if arr[i] > arr[j]:
            increased_dp[i] = max(increased_dp[i], increased_dp[j] + 1)

for i in range(N-1, -1, -1):
    for j in range(N-1, i, -1):
        if arr[i] > arr[j]:
            decreased_dp[i] = max(decreased_dp[i], decreased_dp[j] + 1)

result = 0
for i in range(N):
    result = max(result, increased_dp[i] + decreased_dp[i])

print(result)