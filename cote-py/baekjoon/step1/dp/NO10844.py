# d[i][0] = d[i-1][1]
# d[i][1~8] = d[i-1][j-1] + d[i-1][j+1]
# d[i][9] = d[i-1][8]
MOD = 1_000_000_000

N = int(input())
d = [[0] * 10 for _ in range(N + 1)]

for i in range(1, 10):
    d[1][i] = 1

for i in range(2, N + 1):
    for j in range(10):
        if j == 0:
            d[i][j] = d[i-1][1] % MOD
        elif j == 9:
            d[i][j] = d[i-1][8] % MOD
        else:
            d[i][j] = (d[i-1][j-1] + d[i-1][j+1]) % MOD

print(sum(d[N]) % MOD)