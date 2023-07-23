import sys
N, L = map(int, sys.stdin.readline().split())
pipe_line = [False] * 1001
for index in list(map(int, sys.stdin.readline().split())):
    pipe_line[index] = True

answer = 0
cur = 0
while cur < 1001:
    if pipe_line[cur]:
        answer += 1
        cur += L
    else:
        cur += 1

print(answer)