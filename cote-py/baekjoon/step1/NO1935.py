import sys

N = int(input())
postfix_notation = list(sys.stdin.readline().rstrip())
operands = []
stack = []

for i in range(N):
    operands.append(int(input()))


for value in postfix_notation:
    if value.isalpha():
        stack.append(operands[ord(value) - ord('A')])
    else:
        if not stack:
            continue
        operand1 = stack.pop()
        operand2 = stack.pop()

        if value == "+":
            stack.append(operand2 + operand1)
        elif value == "-":
            stack.append(operand2 - operand1)
        elif value == "*":
            stack.append(operand2 * operand1)
        else:
            stack.append(operand2 / operand1)

print('%.2f' % stack[0])
