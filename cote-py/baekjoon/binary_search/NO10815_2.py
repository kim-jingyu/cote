import sys
from bisect import bisect_left, bisect_right

N = int(input())
user_arr = sorted(map(int, sys.stdin.readline().split()))
M = int(input())
given_arr = list(map(int, sys.stdin.readline().split()))
answer = []

for given_value in given_arr:
    left = bisect_left(user_arr, given_value)
    right = bisect_right(user_arr, given_value)
    answer.append(1 if right - left > 0 else 0)

print(*answer)