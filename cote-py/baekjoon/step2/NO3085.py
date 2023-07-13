import sys

n = int(sys.stdin.readline())
board = list(list(sys.stdin.readline().rstrip()) for _ in range(n))
max_cnt = 0


def check():
    global max_cnt
    for i in range(n):
        cnt = 1
        for j in range(n):
            if j + 1 == n: continue
            if board[i][j] == board[i][j + 1]:
                cnt += 1
                max_cnt = max(max_cnt, cnt)
            else:
                cnt = 1
    for j in range(n):
        cnt = 1
        for i in range(n):
            if i + 1 == n: continue
            if board[i][j] == board[i + 1][j]:
                cnt += 1
                max_cnt = max(max_cnt, cnt)
            else:
                cnt = 1


for i in range(n):
    for j in range(n):
        if j + 1 < n:
            board[i][j], board[i][j + 1] = board[i][j + 1], board[i][j]
            check()
            board[i][j], board[i][j + 1] = board[i][j + 1], board[i][j]
        if i + 1 < n:
            board[i][j], board[i + 1][j] = board[i + 1][j], board[i][j]
            check()
            board[i][j], board[i + 1][j] = board[i + 1][j], board[i][j]

print(max_cnt)
