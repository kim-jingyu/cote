import sys
from collections import deque

n = int(sys.stdin.readline())
current = 1
stack = deque()
op = []
isTrue = True

for _ in range(n):
    end = int(sys.stdin.readline())

    while current <= end:
        op.append('+')
        stack.append(current)
        current += 1

    if stack[-1] == end:
        op.append('-')
        stack.pop()
    else:
        isTrue = False
        break

if not isTrue:
    print("NO")
else:
    for o in op:
        print(o)
