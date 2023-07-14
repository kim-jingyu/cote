import sys

n = int(input())
m = int(input())
excepted = []
if m:
    excepted = list(sys.stdin.readline().rstrip().split(" "))

answer = abs(100 - n)

for i in range(999900):
    for j in str(i):
        if j in excepted:
            break
    else:
        answer = min(answer, len(str(i)) + abs(n - i))

print(answer)