MOD = 1_000_000_000

N, K = map(int, input().split())
board = [[0] * 201 for _ in range(201)]

for i in range(1, N + 1):
    board[1][i] = 1
    board[2][i] = i + 1

for i in range(3, K + 1):
    board[i][1] = i
    for j in range(2, N + 1):
        board[i][j] = (board[i-1][j] + board[i][j-1]) % MOD

print(board[K][N])