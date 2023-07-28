# f(n) = f(n-1 + f(n-2) + f(n-3)
T = int(input())
cached = [0] * 11
cached[1] = 1
cached[2] = 2
cached[3] = 4

for i in range(4, 11):
    cached[i] = cached[i-1] + cached[i-2] + cached[i-3]

for _ in range(T):
    n = int(input())
    print(cached[n])