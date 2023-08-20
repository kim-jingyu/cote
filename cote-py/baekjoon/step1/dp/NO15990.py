# f(1) = 1
# f(2) = 1
# f(3) = 1 + 1 + 1 = 3
# f(4) = 1 -> f(3)..2,3  2 -> f(2)..1,3  3 -> f(1)..1,2
# f(5) = 1 -> f(4)..2,3  2 -> f(3)..1,3  3 -> f(1)..1,2
MOD = 1_000_000_009
T = int(input())
a = list(int(input()) for _ in range(T))

cached = list([0] * 3 for _ in range(max(a) + 1))
cached[1] = [1, 0, 0]
cached[2] = [0, 1, 0]
cached[3] = [1, 1, 1]

for i in range(4, max(a) + 1):
    cached[i][0] = (cached[i - 1][1] + cached[i - 1][2]) % MOD
    cached[i][1] = (cached[i - 2][0] + cached[i - 2][2]) % MOD
    cached[i][2] = (cached[i - 3][0] + cached[i - 3][1]) % MOD

for i in a:
    print(sum(cached[i]) % MOD)

