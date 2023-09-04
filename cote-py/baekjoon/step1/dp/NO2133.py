N = int(input())

d = [0] * 31

d[1] = 0
d[2] = 3
d[3] = 0

for i in range(4, N + 1):
    if i % 2 == 0:
        d[i] = d[i-2]*3 + sum(d[:i-2:2]) * 2 + 2
    else:
        d[i] = 0

print(d[N])