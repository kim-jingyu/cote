import copy

N = int(input())
board = [list(map(int, input().split())) for _ in range(N)]
result = list()


def calculate(d , index):
    for j in range(1, N):
        d[j][0] += min(d[j - 1][1], d[j - 1][2])
        d[j][1] += min(d[j - 1][0], d[j - 1][2])
        d[j][2] += min(d[j - 1][0], d[j - 1][1])
    return d[N - 1][index]


for i in range(3):
    d = copy.deepcopy(board)
    d[0][i] = 1000
    result.append(calculate(d, i))

print(min(result))