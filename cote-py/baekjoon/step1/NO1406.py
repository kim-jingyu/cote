import sys

stack_l = list(sys.stdin.readline().strip())
stack_r = []
n = int(sys.stdin.readline())

for _ in range(n):
    split = sys.stdin.readline().split()

    if split[0] == 'L':
        if stack_l:
            stack_r.append(stack_l.pop())
    elif split[0] == 'D':
        if stack_r:
            stack_l.append(stack_r.pop())
    elif split[0] == 'B':
        if stack_l:
            stack_l.pop()
    elif split[0] == 'P':
        stack_l.append(split[1])

stack_l.extend(reversed(stack_r))
print(''.join(stack_l))
