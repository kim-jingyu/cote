n = int(input())

board = [list(map(int, input().split())) for _ in range(n)]

if n > 1:
    board[1][0] += board[0][0]
    board[1][1] += board[0][0]
for i in range(2, n):
    board[i][0] += board[i-1][0]
    for j in range(1, i):
        board[i][j] += max(board[i-1][j-1], board[i-1][j])
    board[i][i] += board[i-1][i-1]

print(max(board[n-1]))