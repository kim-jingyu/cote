import sys

n, m = map(int, input().split())
arr = sorted(list(map(int, sys.stdin.readline().split())))


def calculate(level, temp_arr):
    if level == m:
        print(' '.join(map(str, temp_arr)))
        return
    for i in range(n):
        temp_arr.append(arr[i])
        calculate(level + 1, temp_arr)
        temp_arr.pop()


calculate(0, [])
