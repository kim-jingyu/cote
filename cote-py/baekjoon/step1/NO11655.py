import sys

S = sys.stdin.readline().rstrip('\n')
answer = []

for value in S:
    if value.isspace() or value.isdigit():
        answer.append(value)
        continue
    if value.isupper():
        temp = (ord(value) - ord('A') + 13) % 26
        s = chr(temp + ord('A'))
        answer.append(s)
    elif value.islower():
        temp = (ord(value) - ord('a') + 13) % 26
        s = chr(temp + ord('a'))
        answer.append(s)

print(''.join(map(str, answer)))