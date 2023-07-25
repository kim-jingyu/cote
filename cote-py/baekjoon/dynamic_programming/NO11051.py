# 이항계수
# bino(n,r) = bino(n-1,r-1) + bino(n-1,r)
MOD = 10007
n, r = map(int, input().split())
cached = [[0] * (n+1) for _ in range(n+1)]

for i in range(n+1):
    cached[i][0] = cached[i][i] = 1
    for j in range(1, i):
        cached[i][j] = cached[i-1][j-1] + cached[i-1][j]
        cached[i][j] %= MOD

print(cached[n][r])