# 3
# 10 12 3 9
# k - x, k - y
# 10 12 7 2
# 13 11 5 6
# 1 2 3 4 5 6 7 8 9 10  1  2
# 1 2 3 4 5 6 7 8 9 10 11 12
for _ in range(int(input())):
    m, n, x, y = map(int, input().split())
    k = x

    while k <= m * n:
        if (k - x) % m == 0 and (k - y) % n == 0:
            print(k)
            break
        k += m
    else:
        print(-1)