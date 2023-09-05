MOD = 9901

N = int(input())

board = [[0] * 3 for _ in range(N)]
for i in range(3):
    board[0][i] = 1

for i in range(1, N):
    board[i][0] = (board[i - 1][0] + board[i - 1][1] + board[i - 1][2]) % MOD
    board[i][1] = (board[i - 1][0] + board[i - 1][2]) % MOD
    board[i][2] = (board[i - 1][0] + board[i - 1][1]) % MOD

print(sum(board[N - 1]) % MOD)
