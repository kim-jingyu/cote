# f(1) = 1
# f(2) = 3
# f(3) = f(2) + f(1) * 2
# f(n) = f(n-1) + f(n-2) * 2
MOD = 10007
n = int(input())
cached = [0] * 1001
cached[1] = 1
cached[2] = 3

for i in range(3, n+1):
    cached[i] = cached[i-1] + cached[i-2] * 2
    cached[i] %= MOD

print(cached[n])