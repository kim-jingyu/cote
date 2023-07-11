import sys
from collections import deque

n, k = map(int, sys.stdin.readline().rstrip().split(" "))
prefix = '<'
suffix = '>'
temp = []
q = deque()

for i in range(n):
    q.append(i+1)

while q:
    for i in range(k-1):
        q.rotate(-1)
    temp.append(str(q.popleft()))

result = ', '.join(temp)
answer = prefix + result + suffix
print(answer)
