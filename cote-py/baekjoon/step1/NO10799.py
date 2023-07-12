import sys

string = sys.stdin.readline().rstrip()
stack = []
result = 0

for i in range(len(string)):
    if string[i] == '(':
        stack.append(string[i])
    elif string[i] == ')':
        if string[i-1] == '(':
            stack.pop()
            result += len(stack)
        elif string[i-1] == ')':
            stack.pop()
            result += 1

print(result)
