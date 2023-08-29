# 1 -> 1
# 2 -> 1+1, 2
# 3 -> f(2) + 1, f(1) + 2, 3
# 4 -> f(3) + 1, f(2) + 2, f(1) + 3
# 5 -> f(4) + 1, f(3) + 2, f(2) + 3
MOD = 1_000_000_009
T = int(input())
arr = [int(input()) for _ in range(T)]
max_num = max(arr)

d = [0] * (max_num + 1)
d[0] = 1
d[1] = 1
d[2] = 2
for i in range(3, max_num + 1):
    d[i] = (d[i-1] + d[i-2] + d[i-3]) % MOD

for value in arr:
    print(d[value])
