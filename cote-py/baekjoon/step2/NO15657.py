import sys

n, m = map(int, input().split())
arr = sorted(list(map(int, sys.stdin.readline().split())))


def calculate(level, current, temp_arr):
    if level == m:
        print(' '.join(map(str, temp_arr)))
        return
    for i in range(current, n):
        temp_arr.append(arr[i])
        calculate(level + 1, i, temp_arr)
        temp_arr.pop()


calculate(0, 0, [])