import sys

n = int(sys.stdin.readline())
stack = []
string = list(map(int, sys.stdin.readline().rstrip().split(" ")))
answer = [-1] * n

for i in range(n):
    while stack and string[stack[-1]] < string[i]:
        answer[stack.pop()] = string[i]
    stack.append(i)

print(*answer)
