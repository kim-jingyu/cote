# P1 = 1, P2 = 5, P3 = 6, P4 = 7
# f(1) = 1
# f(2) = max(f(1), P2)
# f(3) = max(f(2) + f(1), P3)
# f(4) = max(f(3) + f(1) , f(2) + f(2), P4)
N = int(input())
temp = list(map(int, input().split()))

P = [0] * (N + 1)
for i, value in enumerate(temp):
    P[i + 1] = value

cached = [0] * (N + 1)
cached[1] = P[1]

for i in range(2, N + 1):
    cached[i] = P[i]
    for j in range(1, i):
        cached[i] = max(cached[j] + cached[i - j], cached[i])

print(cached[N])
