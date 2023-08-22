# d[1][1]
# d[2][0]
# d[3][1], d[3][0]
N = int(input())

d = [[0] * 2 for _ in range(N + 1)]

d[1][1] = 1

for i in range(2, N + 1):
    for j in range(2):
        if j == 0:
            d[i][j] = d[i - 1][0] + d[i - 1][1]
        else:
            d[i][j] = d[i - 1][0]

print(sum(d[N]))