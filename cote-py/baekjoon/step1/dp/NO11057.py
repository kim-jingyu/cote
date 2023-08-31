# f(1) -> 0 - 9
MOD = 10_007

N = int(input())

board = [[0] * 10 for _ in range(N)]
for i in range(10):
    board[0][i] = 1

for i in range(1, N):
    for j in range(0, 10):
        for k in range(j + 1):
            board[i][j] += board[i - 1][k] % MOD

print(sum(board[N - 1]) % MOD)