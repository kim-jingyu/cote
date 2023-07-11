import sys
from collections import deque

n = int(sys.stdin.readline())
q = deque()

for _ in range(n):
    split = sys.stdin.readline().split()

    if split[0] == 'push_front':
        q.appendleft(split[1])
    elif split[0] == 'push_back':
        q.append(split[1])
    elif split[0] == 'pop_front':
        print(q.popleft()) if q else print(-1)
    elif split[0] == 'pop_back':
        print(q.pop()) if q else print(-1)
    elif split[0] == 'size':
        print(len(q))
    elif split[0] == 'empty':
        print(0) if q else print(1)
    elif split[0] == 'front':
        print(q[0]) if q else print(-1)
    elif split[0] == 'back':
        print(q[-1]) if q else print(-1)
