from itertools import combinations
from math import gcd

t = int(input())

for _ in range(t):
    arr = list(map(int, input().split()))
    real_arr = arr[1:]
    temp = 0

    combs = combinations(real_arr, 2)
    for a, b in combs:
        temp += gcd(a ,b)

    print(temp)