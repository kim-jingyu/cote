from collections import deque
import sys

n = int(sys.stdin.readline())
q = deque()
result = []

for _ in range(n):
    split = sys.stdin.readline().split()

    if split[0] == 'push':
        q.append(split[1])
    elif split[0] == 'pop':
        if q:
            print(q.popleft())
        else:
            print(-1)
    elif split[0] == 'size':
        print(len(q))
    elif split[0] == 'empty':
        if q:
            print(0)
        else:
            print(1)
    elif split[0] == 'front':
        if q:
            print(q[0])
        else:
            print(-1)
    elif split[0] == 'back':
        if q:
            print(q[-1])
        else:
            print(-1)
