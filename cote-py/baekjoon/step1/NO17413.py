import sys
from collections import deque

isTag = False
string = sys.stdin.readline().rstrip()
temp = deque()
result = ""

for s in string:
    if s == '<':
        while temp:
            result += temp.pop()
        isTag = True
        result += s
    elif s == ' ':
        while temp:
            if not isTag:
                result += temp.pop()
            elif isTag:
                result += temp.popleft()
        result += s
    elif s == '>':
        while temp:
            result += temp.popleft()
        isTag = False
        result += s
    else:
        temp.append(s)

while temp:
    result += temp.pop()
print(result)
