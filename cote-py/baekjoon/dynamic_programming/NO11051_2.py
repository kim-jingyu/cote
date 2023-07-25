import sys

sys.setrecursionlimit(10 ** 6)
MOD = 10007
N, R = map(int, sys.stdin.readline().split())
cache = [[-1] * (N + 1) for _ in range(N + 1)]


def bino(n, r):
    if cache[n][r] > 0:
        return cache[n][r]

    if r == 0 or n == r:
        cache[n][r] = 1
    else:
        cache[n][r] = bino(n - 1, r - 1) + bino(n - 1, r)
        cache[n][r] %= MOD

    return cache[n][r]


print(bino(N, R))
