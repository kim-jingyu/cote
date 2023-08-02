import math

M, N = map(int, input().split())


def is_prime(num):
    for x in range(2, int(math.sqrt(num)) + 1):
        if num % x == 0:
            return False
    return True


for i in range(M, N + 1):
    if is_prime(i):
        print(i)
