# 5
# 6 3 2 10 -10
# 8
# 10 9 -5 2 3 4 5 -10
# 500,000 * log500,000
import sys

N = int(input())
user_arr = sorted(map(int, sys.stdin.readline().split()))
M = int(input())
given_arr = list(map(int, sys.stdin.readline().split()))
answer = []

for given_value in given_arr:
    low = 0
    high = len(user_arr) - 1
    mid = (low + high) // 2
    is_true = False

    while low <= high:
        if given_value > user_arr[mid]:
            low = mid + 1
        elif given_value < user_arr[mid]:
            high = mid - 1

        if given_value == user_arr[mid]:
            is_true = True
            break

        mid = (low + high) // 2

    if is_true:
        answer.append(1)
    else:
        answer.append(0)

print(*answer)