# 1 -> 1^2
# 2 -> 1^2 + 1^2
# 3 -> 1^2 + 1^2 + 1^2
# 4 -> 2^2
# 5 -> d[1] + 2^2
# 6 -> d[2] + 2^2
# 7 -> d[3]+ 2^2
# 8 -> d[4] + 2^2
# 9 -> 3^2
# 10 -> d[1] + 3^2
# 11 -> d[2] + 3^2
# 12 -> d[3] + 3^2, d[4] + d[8]
# 13 -> d[4] + 3^2
# 14 -> d[5] + 3^2
# 15 -> d[6] + 3^2
# 16 -> 4^2
N = int(input())
d = [i for i in range(N + 1)]

for i in range(1, N + 1):
    for j in range(i):
        square = j * j
        if square > i:
            break

        if d[i] > d[i - square] + 1:
            d[i] = d[i - square] + 1

print(d[N])