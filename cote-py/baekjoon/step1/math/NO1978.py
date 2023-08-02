import math

N = int(input())
arr = list(map(int, input().split()))
cnt = 0


def is_prime(num):
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True


for value in arr:
    if value == 1:
        continue
    if is_prime(value):
        cnt += 1

print(cnt)
