import sys
from itertools import combinations

t = int(input())
board = [list(map(int, sys.stdin.readline().split())) for _ in range(t)]


def gcd(n1, n2):
    if n2 == 0:
        return n1

    return gcd(n2, n1 % n2)


for arr in board:
    real_arr = arr[1:]
    temp = 0

    combs = combinations(real_arr, 2)
    for a, b in combs:
        temp += gcd(a, b)

    print(temp)
