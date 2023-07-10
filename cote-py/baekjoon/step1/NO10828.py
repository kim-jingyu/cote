import sys
from collections import deque

n = int(sys.stdin.readline())
stack = deque()

for _ in range(n):
    split = sys.stdin.readline().split()

    if split[0] == 'push':
        stack.append(split[1])
    elif split[0] == 'pop':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())
    elif split[0] == 'size':
        print(len(stack))
    elif split[0] == 'empty':
        if len(stack) == 0:
            print(1)
        else:
            print(0)
    elif split[0] == 'top':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[-1])