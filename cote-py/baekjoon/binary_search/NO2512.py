# 10000 * log100000
# parametric search - binary search
import sys

N = int(input())
arr = list(map(int, sys.stdin.readline().split()))
M = int(input())

low = 0
high = max(arr)
mid = (low + high) // 2
answer = 0


def is_possible(mid):
    return sum(min(i, mid) for i in arr) <= M


while low <= high:
    if is_possible(mid):
        low = mid + 1
        answer = mid
    else:
        high = mid - 1

    mid = (low + high) // 2

print(answer)