T = int(input())

for _ in range(T):
    n = int(input())

    board = [list(map(int, input().split())) for _ in range(2)]

    if n > 1:
        board[0][1] += board[1][0]
        board[1][1] += board[0][0]
    for i in range(2, n):
        board[0][i] += max(board[1][i - 1], board[1][i - 2])
        board[1][i] += max(board[0][i - 1], board[0][i - 2])

    print(max(board[0][n - 1], board[1][n - 1]))
