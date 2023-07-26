# 2Xn 타일링
# f(1) = 1
# f(2) = 2
# f(3) = 3 = f(2) + f(1)
# f(n) = f(n-1) + f(n-2)
# O(N)
MOD = 10007
n = int(input())
cached = [0] * 1001
cached[1] = 1
cached[2] = 2

for i in range(3, 1001):
    cached[i] = cached[i-1] + cached[i-2]
    cached[i] %= MOD

print(cached[n])
