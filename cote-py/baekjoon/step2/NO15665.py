import sys

n, m = map(int, input().split())
arr = sorted(list(map(int, sys.stdin.readline().split())))
answer = set()


def calculate(level, temp_arr):
    if level == m:
        answer.add(tuple(temp_arr))
        return
    for i in range(n):
        temp_arr.append(arr[i])
        calculate(level + 1, temp_arr)
        temp_arr.pop()


calculate(0, [])

sorted_answer = sorted(list(answer))
for value in sorted_answer:
    print(' '.join(map(str, value)))