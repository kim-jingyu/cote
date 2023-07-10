# 괄호
import sys
from collections import deque

n = int(sys.stdin.readline())

for _ in range(n):
    stack = deque()
    result = "YES"

    split = list(sys.stdin.readline().rstrip())

    for bracket in split:
        if bracket == '(':
            stack.append('(')
        elif bracket == ')':
            if len(stack) == 0:
                result = "NO"
                break
            pop = stack.pop()
            if pop != '(':
                result = "NO"
                break

    if len(stack) != 0:
        result = "NO"

    print(result)
